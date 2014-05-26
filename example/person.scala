class Person(val name : String = "Roger", var age : Int = 8) {
  println("Creating " + name)
  override def toString() = name + " age " + age
}
