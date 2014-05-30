class Point(val x:Double, val y:Double) {
  override def toString() = "%g,%g".format(x,y)
}

object Point {
  def apply(x:Double, y:Double) = new Point(x,y)
}

class LabeledPoint(val label:String, x:Double, y:Double) extends Point(x,y) {
}

abstract class Shape {
  def centerPoint : Point
}

class Rectangle(p1:Point, p2:Point) extends Shape {
  def centerPoint : Point = Point((p1.x+p2.x)/2, (p1.y+p2.y)/2)
  override def toString = "[%s,%s]".format(p1.toString,p2.toString)
}

object Rectangle {
  def apply(p1:Point,p2:Point) = new Rectangle(p1,p2)
}

class Circle(p:Point, r:Double) extends Shape {
  def centerPoint : Point = p
  override def toString = "[%s,%g]".format(p,r);
}

object Circle {
  def apply(p:Point, r:Double) = new Circle(p,r)
}

