package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{

        'prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(100) == "100")
            assert(Exercises.prettyBooleanFormatter1("ВСЕМ ПРИВЕТ") == "ВСЕМ ПРИВЕТ")
        }
        'prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(100) == "100")
            assert(Exercises.prettyBooleanFormatter2("ВСЕМ ПРИВЕТ") == "ВСЕМ ПРИВЕТ")
        }
        'prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(100) == "100")
            assert(Exercises.prettyBooleanFormatter3("ВСЕМ ПРИВЕТ") == "ВСЕМ ПРИВЕТ")
        }

        'max1 - {
            assert(Exercises.max1(Seq(1,100, 35, 0)) == 100)
            try Exercises.max1(Seq()) catch {case x: NoSuchElementException => print ("NoSuchElementExceptionTestPassed")}
        }
        'max2 - {
            assert(Exercises.max2(Seq(1,100, 35, 0)) == Seq(100))
            try Exercises.max2(Seq()) catch {case x: NoSuchElementException => print ("NoSuchElementExceptionTestPassed")}
        }
        'max3 - {
            assert(Exercises.max3(Seq(1,100, 35, 0)) == Option(100))
            try Exercises.max3(Seq()) catch {case x: NoSuchElementException => print ("NoSuchElementExceptionTestPassed")}
        }

        'sum1 - {
            assert(Exercises.sum1(10, 123) == 133)
            assert(Exercises.sum1(-10, -220) == -230)
            assert(Exercises.sum1(0, 0) == 0)
        }
        'sum2 - {
            assert(Exercises.sum2(10, 123) == 133)
            assert(Exercises.sum2(-10, -220) == -230)
            assert(Exercises.sum2(0, 0) == 0)
        }
        'sum3 - {
            assert(Exercises.sum3(10, 123) == 133)
            assert(Exercises.sum3(-10, -220) == -230)
            assert(Exercises.sum3(0, 0) == 0)
        }
    }
}
