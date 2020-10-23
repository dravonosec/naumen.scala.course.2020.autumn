import Exercises.Vector2D
import utest._

object Tests extends TestSuite {
   val tests = Tests{
     'testDivBy3Or7 - {
       assert(Exercises.divBy3Or7(0, 10) == Seq(0,3,6,7,9))
       assert(Exercises.divBy3Or7(0, 0) == Seq(0))
       assert(Exercises.divBy3Or7(-10, 0) == Seq(-9,-7,-6,-3,0))
     }
    'testSumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(0, 10) == 33)
      assert(Exercises.sumOfDivBy3Or5(4, 0) == 0)
      assert(Exercises.sumOfDivBy3Or5(-5, 5) == 0)
      assert(Exercises.sumOfDivBy3Or5(-5, 0) == -8)
      assert(Exercises.sumOfDivBy3Or5(5, 5) == 5)
      assert(Exercises.sumOfDivBy3Or5(7, 7) == 0)
    }
    'test_primeFactor - {
      assert(Exercises.primeFactor(10) == Seq(2,5))
      assert(Exercises.primeFactor(0) == Seq())
      assert(Exercises.primeFactor(-100) == Seq())
      assert(Exercises.primeFactor(189) == Seq(3,7))
      assert(Exercises.primeFactor(11) == Seq(11))
      assert(Exercises.primeFactor(2) == Seq(2))
    }
    'test_sumSByFunc - {
      assert(Exercises.sumByFunc(Vector2D(0,0), Vector2D(0,0),Exercises.scalar _ ,Vector2D(0,0), Vector2D(0,0)) == 0.0)
      assert(Exercises.sumByFunc(Vector2D(2,3), Vector2D(4,5),Exercises.scalar _ ,Vector2D(1,1), Vector2D(0,5)) == 28.0)
      assert(Exercises.sumByFunc(Vector2D(1,0), Vector2D(0,1),Exercises.cosBetween _ ,Vector2D(0,1), Vector2D(1,0)) == 0.0)
      assert(Exercises.sumByFunc(Vector2D(1,0), Vector2D(3,4),Exercises.cosBetween _ , Vector2D(3,4), Vector2D(1,0)) == 1.2)
    }
    'test_sortByHeavyweight - {
      assert(Exercises.sortByHeavyweight(Map ("Gold"->(0,0))) == Seq("Gold"))
      assert(Exercises.sortByHeavyweight(Map ("Золото"->(10,467))) == Seq("Золото"))
      assert(Exercises.sortByHeavyweight(Map ("1"->(1,1), "2"->(2,2), "3"->(3,3),"4"->(4,4))) == Seq("1","2","3","4"))
      assert(Exercises.sortByHeavyweight(Map ( "2"->(2,2), "1"->(1,1),"4"->(4,4), "3"->(3,3))) == Seq("1","2","3","4"))
      assert(Exercises.sortByHeavyweight(Map ()) == Seq())
    }
  }
}