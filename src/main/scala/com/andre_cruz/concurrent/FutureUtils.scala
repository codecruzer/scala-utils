package com.andre_cruz.concurrent

import scala.concurrent.{ExecutionContext, Future}
import scala.util.Try


object FutureUtils {

  implicit def tryToFuture[T](source: Try[T]): Future[T] = Future.fromTry(source)

  implicit class RichFuture[T](underlying: Future[T]) {

    def orElse(other: => Future[T])(implicit ec: ExecutionContext): Future[T] =
      underlying recoverWith { case _ => other }

  }

}
