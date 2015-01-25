package com.andre_cruz.math

object MathUtils {

  def clamp(n: Int, minBound: Int, maxBound: Int) = (n max minBound) min maxBound
  def clamp(n: Long, minBound: Long, maxBound: Long) = (n max minBound) min maxBound
  def clamp(n: Float, minBound: Float, maxBound: Float) = (n max minBound) min maxBound
  def clamp(n: Double, minBound: Double, maxBound: Double) = (n max minBound) min maxBound

}
