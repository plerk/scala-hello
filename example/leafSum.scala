def leafSum(node: List[Any]) : Int = { 
  node match { 
    case List(a:Int, c @ _*) => a + leafSum(c.toList)
    case List(a:List[Any], c @ _*) => leafSum(a) + leafSum(c.toList)
    case List() => 0
  }
}
