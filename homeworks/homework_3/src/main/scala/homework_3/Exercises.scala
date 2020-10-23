package homework_3

object Exercises {

    def prettyBooleanFormatter1(x: Any): String = {
        if (x.getClass.getSimpleName == "Boolean")
            if (x.asInstanceOf[Boolean])
                "правда" else "ложь"
        else x.toString
    }
    def prettyBooleanFormatter2(x: Any): String = x.toString match {
        case "true" => "правда"
        case "false" => "ложь"
        case _ => x.toString
    }
    def prettyBooleanFormatter3(x: Any): String =
    {
        if (x.isInstanceOf[Boolean])
            if (x.asInstanceOf[Boolean])
                "правда" else "ложь"
        else x.toString
    }

    def max1(xs: Seq[Int]): Int = {
        if (!xs.isEmpty) xs.max else throw new NoSuchElementException
    }
    def max2(xs: Seq[Int]): Seq[Int] = {
        if (!xs.isEmpty) Seq(xs.max) else throw new NoSuchElementException
    }
    def max3(xs: Seq[Int]): Option[Int] = {
        if (!xs.isEmpty) Option(xs.max) else throw new NoSuchElementException
    }


    def sumIntegers[CollectionType <: Iterable[Int]](xs: CollectionType): Int = xs.sum

    def sum1(x: Int, y: Int): Int = sumIntegers(List(x,y))
    def sum2(x: Int, y: Int): Int = sumIntegers(Seq(x,y))
    def sum3(x: Int, y: Int): Int = sumIntegers(MyIterableClass(x,y))

    case class MyIterableClass[T](x: T, y:T) extends Iterable[T] {
        override def iterator: Iterator[T] = Iterator (x,y)}
}
