object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal


  case class Shelter[+T <: Animal] (animals: List[T])  {
    def +[A>:T<:Animal] (addingAnimal: A) = {
      Shelter[A](animals :+ addingAnimal)
    }
    def ++[A>:T<:Animal] (addingShelter: Shelter[A]) = {
      Shelter[A](animals ++ addingShelter.animals)
    }
    def getNames:Seq[String] = {
      animals.map(_.name)
    }
    def feed(food: Food[T]) = {
      animals.map(food.feed)}
    }

  trait Food [-A<:Animal] {
    def name:String
    def feed (animal: A)  = s"${animal.name} eats ${this.name}"
  }

  case object Meat extends Food[Animal] {
    override def name: String = "meat"
  }

  case object Milk extends Food[Cat] {
    override def name: String = "milk"
  }

  case object Bread extends Food[Dog] {
    override def name: String = "bread"
  }
}