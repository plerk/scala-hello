class Point(val x:Int, val y:Int) {
  override def toString() = "[" + x + "," + y + "]"
}

object Point {
  def apply(x:Int, y:Int) = new Point(x,y)
}
