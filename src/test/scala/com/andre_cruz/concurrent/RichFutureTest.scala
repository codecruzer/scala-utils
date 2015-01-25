package com.andre_cruz.concurrent

import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{Matchers, WordSpecLike}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future


class RichFutureTest extends WordSpecLike with Matchers with ScalaFutures {

  import com.andre_cruz.concurrent.FutureUtils.RichFuture

  "A RichFuture" when {
    "using orElse with a source that successfully completes" should {
      "yield the source future" in {
        val f = Future { 1 } orElse Future { 2 }
        f.futureValue should be (1)
      }

      "not evaluate the 'other' block" in {
        val f = Future { 1 } orElse Future { fail("other block was evaluated") }
        f.futureValue should be (1)
      }
    }

    "using orElse with a source that unsuccessfully completes" should {
      "evaluate and yield the other future" in {
        val failed = Future[Int] { throw new Exception() }
        def other = Future { 2 }
        val f = failed orElse other
        f.futureValue should be (2)
      }
    }

    "using orElse where both futures fail" should {
      "yield the other's failure" in {
        val source = Future[Int] { throw new Exception() }
        val other = Future[Int] { throw new ArithmeticException() }
        val f = source orElse other
        f.failed.futureValue shouldBe an [ArithmeticException]
      }
    }
  }

}
