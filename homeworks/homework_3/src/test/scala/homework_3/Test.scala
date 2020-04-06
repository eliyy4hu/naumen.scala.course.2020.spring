package homework_3

import utest._

object Test extends TestSuite {

  val tests = Tests {
    'test_prettyBooleanFormatter1 - {
      val trueStr = "правда"
      assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
    }
    'test_prettyBooleanFormatter2 - {
      val trueStr = "правда"
      assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
    }
    'test_prettyBooleanFormatter3 - {
      val trueStr = "правда"
      assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
    }
    'test_max1 - {
      assert(Exercises.max1(Seq(1, 2, 3)) == 3)
    }
    'test_max2 - {
      assert(Exercises.max2(Seq(3, 1, 2, 3)) == Seq(3, 3))
      assert(Exercises.max2(Seq()) == Seq())
    }
    'test_max3 - {
      assert(Exercises.max3(Seq(1, 2, 3)) == Option(3))
      assert(Exercises.max3(Seq()) == None)
    }
    'test_sum1 - {
      assert(Exercises.sum1(1, 2) == 3)
    }
    'test_sum2 - {
      assert(Exercises.sum2(1, 2) == 3)
    }
    'test_sum3 - {
      assert(Exercises.sum3(1, 2) == 3)
    }
  }
}
