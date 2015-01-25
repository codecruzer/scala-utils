package com.andre_cruz.math

import org.scalatest.{Matchers, WordSpecLike}


trait NumericUtilsTest extends WordSpecLike with Matchers

class RichIntTest extends NumericUtilsTest {

  import NumericUtils.RichInt

  "A RichInt" should {
    "clamp to a value within specified bounds" in {
      val Min = 1
      val Max = 10
      0 clamp(Min, Max) should be (Min)
      11 clamp(Min, Max) should be (Max)
      5 clamp(Min, Max) should be (5)
    }
  }

}

class RichLongTest extends NumericUtilsTest {

  import NumericUtils.RichLong

  "A RichLong" should {
    "clamp to a value within specified bounds" in {
      val Min = 1L
      val Max = 10L
      0L clamp(Min, Max) should be (Min)
      11L clamp(Min, Max) should be (Max)
      5L clamp(Min, Max) should be (5L)
    }
  }

}

class RichFloatTest extends NumericUtilsTest {

  import NumericUtils.RichFloat

  "A RichFloat" should {
    "clamp to a value within specified bounds" in {
      val Min = 1.0F
      val Max = 10.0F
      0.0F clamp(Min, Max) should be (Min)
      11.0F clamp(Min, Max) should be (Max)
      5.0F clamp(Min, Max) should be (5.0F)
    }
  }

}

class RichDoubleTest extends NumericUtilsTest {

  import NumericUtils.RichDouble

  "A RichDouble" should {
    "clamp to a value within specified bounds" in {
      val Min = 1.0D
      val Max = 10.0D
      0.0D clamp(Min, Max) should be (Min)
      11.0D clamp(Min, Max) should be (Max)
      5.0D clamp(Min, Max) should be (5.0D)
    }
  }

}
