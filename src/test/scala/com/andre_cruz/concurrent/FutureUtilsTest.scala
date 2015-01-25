package com.andre_cruz.concurrent

import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{Matchers, WordSpecLike}

import scala.concurrent.Future
import scala.util.Try


class FutureUtilsTest extends WordSpecLike with Matchers with ScalaFutures {

  import com.andre_cruz.concurrent.FutureUtils._

  "tryToFuture implicit conversion" should {

    "convert a Try[T] to Future[T]" in {
      val result: Future[Int] = Try { 123 }
      result shouldBe a [Future[_]]
    }

    "convert a Success[T] to a successful Future[T]" in {
      val result: Future[Int] = Try { 123 }
      result.futureValue should be (123)
    }

    "convert a Failure[T] to a failed Future[T]" in {
      val result: Future[Int] = Try { throw new ArithmeticException() }
      result.failed.futureValue shouldBe an [ArithmeticException]
    }

  }


}
