object task1 extends App {
  val myName = "Alex"
  println(f"Hello Scala, this is $myName")

  val greets = Array("Hello ", "Ohayo", "Hola")
  for (greet <- greets)
  {
    println(f"$greet Scala, this is $myName")
  }

  val reverseMyName = myName.reverse
  for (greet <- greets)
  {
    println(f"$greet Scala, this is $reverseMyName")
  }
}
