class Person(name : String) extends Serializable {

  val (firstName, lastName) = {
    val a = name.split("""\s""")
    if(a.length != 2)
      throw new Exception("Must provide exactly one first and one last name separated by a space")
    (a(0),a(1))
  }

  override def toString() = firstName + " " + lastName;
  
}
