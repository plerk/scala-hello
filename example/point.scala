class Point(val x:Double, val y:Double) {
  override def toString() = "[" + x + "," + y + "]"
}

object Point {
  def apply(x:Double, y:Double) = new Point(x,y)
}

class LabeledPoint(val label:String, x:Double, y:Double) extends Point(x,y) {
}
