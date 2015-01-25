package com.andre_cruz.math

import org.scalatest.{Matchers, WordSpecLike}


class MathUtilsTest extends WordSpecLike with Matchers {

  import com.andre_cruz.math.MathUtils._

  "MathUtils" when {

    "clamping an Int value" should {

      val MinBound = 1
      val MaxBound = 10

      "clamp a negative bounded value to minimum bound" in {
        clamp(0, MinBound, MaxBound) should be (MinBound)
      }
      "clamp a positive bounded value to maximum bound" in {
        clamp(11, MinBound, MaxBound) should be (MaxBound)
      }
      "pass through a value within bounds" in {
        val n = 5
        clamp(n, MinBound, MaxBound) should be (n)
      }
    }

    "clamping a Long value" should {

      val MinBound = 1L
      val MaxBound = 10L

      "clamp a negative bounded value to minimum bound" in {
        clamp(0L, MinBound, MaxBound) should be (MinBound)
      }
      "clamp a positive bounded value to maximum bound" in {
        clamp(11L, MinBound, MaxBound) should be (MaxBound)
      }
      "pass through a value within bounds" in {
        val n = 5L
        clamp(n, MinBound, MaxBound) should be (n)
      }
    }

    "clamping a Float value" should {

      val MinBound = 1.0F
      val MaxBound = 10.0F

      "clamp a negative bounded value to minimum bound" in {
        clamp(0.0F, MinBound, MaxBound) should be (MinBound)
      }
      "clamp a positive bounded value to maximum bound" in {
        clamp(11.0F, MinBound, MaxBound) should be (MaxBound)
      }
      "pass through a value within bounds" in {
        val n = 5.0F
        clamp(n, MinBound, MaxBound) should be (n)
      }
    }

    "clamping a Double value" should {

      val MinBound = 1D
      val MaxBound = 10D

      "clamp a negative bounded value to minimum bound" in {
        clamp(0.0D, MinBound, MaxBound) should be (MinBound)
      }
      "clamp a positive bounded value to maximum bound" in {
        clamp(11.0D, MinBound, MaxBound) should be (MaxBound)
      }
      "pass through a value within bounds" in {
        val n = 5.0D
        clamp(n, MinBound, MaxBound) should be (n)
      }
    }

  }

}
