val pattern = "([0-9]+) ([a-z]+).*".r
println(
  "99 bottles of beer on the wall" match {
    case pattern(num, word) => (Integer.parseInt(num), word)
    case _ => "pattern did not match"
  }
)
