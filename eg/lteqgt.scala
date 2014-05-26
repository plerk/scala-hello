def lteqgt(values: Array[Int], v:Int) = {
  (values.filter { _ < v}.length, values.filter { _ == v }.length, values.filter { _ > v }.length)
}

def lteqgt2(values: Array[Int], v:Int) : (Int, Int, Int) = {
  if(values.length == 0)
    (0,0,0)
  else {
    val (lt,eq,gt) = lteqgt2(values.tail, v)
    if(values.head < v)
      (lt+1,eq,gt)
    else if(values.head == v)
      (lt,eq+1,gt)
    else
      (lt,eq,gt+1)
  }
}
