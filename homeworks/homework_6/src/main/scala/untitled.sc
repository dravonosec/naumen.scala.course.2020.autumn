def wordReverse(text: String): String={
  val delimiters = Array(",","!",".")
  text.split("").map(
    ch => if (delimiters.contains(ch)) " " + ch
  else ch).mkString("").split(" ").map(word =>
  if (word.contains(delimiters)) word
  else if (word.charAt(0).isUpper) word.toLowerCase.reverse.capitalize
  else word.reverse).mkString(" ").split(" ")
    .map(word =>
    if (word.charAt(0).isLetter) " " + word
    else word).mkString("")
}

def wordReverse1(text: String): String = {
  text.split("(?=[!., ])|(?<=[!., ])")
    .map(word =>
      if(word.charAt(0).isUpper)
        word.toLowerCase.reverse.capitalize
      else
        word.reverse)
    .mkString("")
}

println(wordReverse("Zima!.. A s nei i holod, ahahah..."))
println(wordReverse("SOS"))
println(wordReverse("Winter!.. Peasant, triumphant..."))
println(wordReverse1("Зима!.. Крестьянин, торжествуя..."))
//Zima!.. A s nei i holod, ahahah...
//Amiz!.. A s ien i doloh, hahaha...

//Retniw!.. Tnasaep, tnahpmuirt...
//Retniw!.. Tnasaep, tnahpmuirt...