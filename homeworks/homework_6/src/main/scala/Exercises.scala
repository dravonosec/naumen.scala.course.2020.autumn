object Exercises {

  //решение вызовом одного метода у Seq
  //def reverse[T](seq: Seq[T]): Seq[T] = seq.reverse

  //решение при помощи рекурсии:
  def reverse[T](seq: Seq[T]): Seq[T] ={
    if (seq.isEmpty) Seq[T]()
    else seq.last +: reverse(seq.dropRight(1))
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */

  def fibonacci4Index(idx: Int): Int = {
    if (idx > 1) fibonacci4Index(idx-1) + fibonacci4Index(idx - 2)
    else idx
  }

  // C мутабельным Seq():
  /*
  def fibonacci(idx: Int): Seq[Int] = {
    var result = Seq[Int]()
    for (n <- 0 to idx)
      result = result:+fibonacci4Index(n)
    result
  }
  */

  // Решение с иммутабельным Seq()
  def fibonacci(idx: Int): Seq[Int] = {
    for (i <- 0 to idx)
      yield fibonacci4Index(i)
  }


  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String =
    text.toUpperCase().split("").map(char =>
      if (MORSE.contains(char)) " " + MORSE(char)
      else if (char == " ") "  "
      else char
    ).mkString("").drop(1)

  def wordReverse(text: String): String= {
    val delimiters = Array(",", "!", ".")
    text.split("").map(
      ch => if (delimiters.contains(ch)) " " + ch
      else ch).mkString("")
      .split(" ")
      .map(word =>
        if (word.contains(delimiters)) word
        else if (word.charAt(0).isUpper) word.toLowerCase.reverse.capitalize
        else word.reverse).mkString(" ")
      .split(" ")
      .map(word =>
        if (word.charAt(0).isLetter) " " + word
        else word).mkString("").drop(1)
  }
}

