object Conversions {
  def inchesToCentimeters(value : Double ) = value * 2.54
  def gallonsToLiters(value : Double) = value * 3.78541
  def milesToKilometers(value : Double) = value * 1.60934
}

abstract class UnitConversions {
  def convert(value: Double) :Double
}

object InchesToCentimeters extends UnitConversions {
  override def convert(value:Double) = value * 2.54
}

object GallonsToLiters extends UnitConversions {
  override def convert(value:Double) = value * 3.78541
}

object MilesToKilometers extends UnitConversions {
  override def convert(value:Double) = value * 1.60934
}
