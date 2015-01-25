package com.andre_cruz.math


object NumericUtils {

  implicit class RichInt(val underlying: Int) extends AnyVal {
    def clamp(min: Int, max: Int): Int = MathUtils.clamp(underlying, min, max)
  }

  implicit class RichLong(val underlying: Long) extends AnyVal {
    def clamp(min: Long, max: Long): Long = MathUtils.clamp(underlying, min, max)
  }

  implicit class RichFloat(val underlying: Float) extends AnyVal {
    def clamp(min: Float, max: Float): Float = MathUtils.clamp(underlying, min, max)
  }

  implicit class RichDouble(val underlying: Double) extends AnyVal {
    def clamp(min: Double, max: Double): Double = MathUtils.clamp(underlying, min, max)
  }

}
