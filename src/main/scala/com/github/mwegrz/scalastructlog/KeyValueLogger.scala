package com.github.mwegrz.scalastructlog

import scala.reflect.ClassTag
import scala.reflect.macros.blackbox
import Logger.Tags
import com.github.mwegrz.scalastructlog.slf4j.Slf4jKeyValueAdapter

object KeyValueLogger {
  import language.implicitConversions

  def apply[T](a: KeyValueAdapter): KeyValueLogger = new KeyValueLogger(a)

  def apply[T](c: Class[T]): KeyValueLogger =
    new KeyValueLogger(new Slf4jKeyValueAdapter(c))

  def apply[T]()(implicit ct: ClassTag[T]): KeyValueLogger =
    new KeyValueLogger(new Slf4jKeyValueAdapter(ct.runtimeClass))

  type Key = String
  type Value = Any
  type KeyValuePair = (String, Any)

  trait KeyValuePairs {
    val elems: Product

    def toMap: Map[Key, Value] =
      List(
        elems.productIterator
          .map(_.asInstanceOf[KeyValuePair])
          .toList
          .reverse: _*
      ).toMap
  }

  implicit def keyValuePairToKeyValuePairs(pair: KeyValuePair): KeyValuePairs =
    Tuple1(pair)

  implicit class KeyValuePairs1(val elems: Tuple1[KeyValuePair]) extends KeyValuePairs

  implicit class KeyValuePairs2(val elems: (KeyValuePair, KeyValuePair)) extends KeyValuePairs

  implicit class KeyValuePairs3(val elems: (KeyValuePair, KeyValuePair, KeyValuePair)) extends KeyValuePairs

  implicit class KeyValuePairs4(val elems: (KeyValuePair, KeyValuePair, KeyValuePair, KeyValuePair))
      extends KeyValuePairs

  implicit class KeyValuePairs5(val elems: (KeyValuePair, KeyValuePair, KeyValuePair, KeyValuePair, KeyValuePair))
      extends KeyValuePairs

  implicit class KeyValuePairs6(
      val elems: (KeyValuePair, KeyValuePair, KeyValuePair, KeyValuePair, KeyValuePair, KeyValuePair)
  ) extends KeyValuePairs

  implicit class KeyValuePairs7(
      val elems: (KeyValuePair, KeyValuePair, KeyValuePair, KeyValuePair, KeyValuePair, KeyValuePair, KeyValuePair)
  ) extends KeyValuePairs

  implicit class KeyValuePairs8(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs9(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs10(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs11(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs12(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs13(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs14(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs15(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs16(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs17(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs18(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs19(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs20(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs21(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  implicit class KeyValuePairs22(
      val elems: (
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair,
          KeyValuePair
      )
  ) extends KeyValuePairs

  private object Macros {
    type C = blackbox.Context { type PrefixType = KeyValueLogger }

    // Info
    def infoMessageContext(c: C)(message: c.Expr[String], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"if ($l.isInfoEnabled) $l.info($message, $context.toMap)"
    }

    def infoTagMessageContext(c: C)(tags: c.Expr[Tags], message: c.Expr[String], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"if ($l.isInfoEnabled) $l.info($tags.toList, $message, $context.toMap)"
    }

    def infoMessageCauseContext(
        c: C
    )(message: c.Expr[String], cause: c.Expr[Throwable], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"""if ($l.isInfoEnabled) $l.info($message, $cause, $context.toMap)
          $cause
       """
    }

    def infoTagMessageCauseContext(
        c: C
    )(tags: c.Expr[Tags], message: c.Expr[String], cause: c.Expr[Throwable], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"""if ($l.isInfoEnabled) $l.info($tags.toList, $message, $cause, $context.toMap)
         $cause
       """
    }

    // Debug
    def debugMessageContext(c: C)(message: c.Expr[String], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"if ($l.isDebugEnabled) $l.debug($message, $context.toMap)"
    }

    def debugTagMessageContext(c: C)(tags: c.Expr[Tags], message: c.Expr[String], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"if ($l.isDebugEnabled) $l.debug($tags.toList, $message, $context.toMap)"
    }

    def debugMessageCauseContext(
        c: C
    )(message: c.Expr[String], cause: c.Expr[Throwable], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"""if ($l.isDebugEnabled) $l.debug($message, $cause, $context.toMap)
          $cause
       """
    }

    def debugTagMessageCauseContext(
        c: C
    )(tags: c.Expr[Tags], message: c.Expr[String], cause: c.Expr[Throwable], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"""if ($l.isDebugEnabled) $l.debug($tags.toList, $message, $cause, $context.toMap)
         $cause
       """
    }

    // Warning
    def warningMessageContext(c: C)(message: c.Expr[String], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"if ($l.isWarningEnabled) $l.warning($message, $context.toMap)"
    }

    def warningTagMessageContext(c: C)(tags: c.Expr[Tags], message: c.Expr[String], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"if ($l.isWarningEnabled) $l.warning($tags.toList, $message, $context.toMap)"
    }

    def warningMessageCauseContext(
        c: C
    )(message: c.Expr[String], cause: c.Expr[Throwable], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"""if ($l.isWarningEnabled) $l.warning($message, $cause, $context.toMap)
          $cause
       """
    }

    def warningTagMessageCauseContext(
        c: C
    )(tags: c.Expr[Tags], message: c.Expr[String], cause: c.Expr[Throwable], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"""if ($l.isWarningEnabled) $l.warning($tags.toList, $message, $cause, $context.toMap)
         $cause
       """
    }

    // Error
    def errorMessageContext(c: C)(message: c.Expr[String], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"if ($l.isErrorEnabled) $l.error($message, $context.toMap)"
    }

    def errorTagMessageContext(c: C)(tags: c.Expr[Tags], message: c.Expr[String], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"if ($l.isErrorEnabled) $l.error($tags.toList, $message, $context.toMap)"
    }

    def errorMessageCauseContext(
        c: C
    )(message: c.Expr[String], cause: c.Expr[Throwable], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"""if ($l.isErrorEnabled) $l.error($message, $cause, $context.toMap)
          $cause
       """
    }

    def errorTagMessageCauseContext(
        c: C
    )(tags: c.Expr[Tags], message: c.Expr[String], cause: c.Expr[Throwable], context: c.Expr[KeyValuePairs]) = {
      import c.universe._
      val l = q"${c.prefix}.underlying"
      q"""if ($l.isErrorEnabled) $l.error($tags.toList, $message, $cause, $context.toMap)
         $cause
       """
    }
  }
}

class KeyValueLogger private (override val underlying: KeyValueAdapter) extends Logger(underlying) {
  import KeyValueLogger.KeyValuePairs
  import KeyValueLogger.Macros
  import language.experimental.macros

  // Info
  def info(message: String, context: KeyValuePairs): Unit =
    macro Macros.infoMessageContext

  def info(tags: Tags, message: String, context: KeyValuePairs): Unit =
    macro Macros.infoTagMessageContext

  def info[A <: Throwable](message: String, cause: A, context: KeyValuePairs): A =
    macro Macros.infoMessageCauseContext

  def info[A <: Throwable](tags: Tags, message: String, cause: A, context: KeyValuePairs): A =
    macro Macros.infoTagMessageCauseContext

  // Debug
  def debug(message: String, context: KeyValuePairs): Unit =
    macro Macros.debugMessageContext

  def debug(tags: Tags, message: String, context: KeyValuePairs): Unit =
    macro Macros.debugTagMessageContext

  def debug[A <: Throwable](message: String, cause: A, context: KeyValuePairs): A =
    macro Macros.debugMessageCauseContext

  def debug[A <: Throwable](tags: Tags, message: String, cause: A, context: KeyValuePairs): A =
    macro Macros.debugTagMessageCauseContext

  // Warning
  def warning(message: String, context: KeyValuePairs): Unit =
    macro Macros.warningMessageContext

  def warning(tags: Tags, message: String, context: KeyValuePairs): Unit =
    macro Macros.warningTagMessageContext

  def warning[A <: Throwable](message: String, cause: A, context: KeyValuePairs): A =
    macro Macros.warningMessageCauseContext

  def warning[A <: Throwable](tags: Tags, message: String, cause: A, context: KeyValuePairs): A =
    macro Macros.warningTagMessageCauseContext

  // Error
  def error(message: String, context: KeyValuePairs): Unit =
    macro Macros.errorMessageContext

  def error(tags: Tags, message: String, context: KeyValuePairs): Unit =
    macro Macros.errorTagMessageContext

  def error[A <: Throwable](message: String, cause: A, context: KeyValuePairs): A =
    macro Macros.errorMessageCauseContext

  def error[A <: Throwable](tags: Tags, message: String, cause: A, context: KeyValuePairs): A =
    macro Macros.errorTagMessageCauseContext
}
