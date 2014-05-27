import scala.collection.mutable.ArrayBuffer

abstract class Item {
  def price : Double
  def description : String
  
  override def toString = "%s $%1.02f".format(description, price)
}

class SimpleItem(p:Double, d:String) extends Item {
  override val price = p
  override val description = d
}

class Bundle extends Item {
  private val items = new ArrayBuffer[Item]
  
  override def price = items.map { _.price }.sum
  override def description = "bundle of [" + (items.map { _.description }.mkString(", ")) +"]"
  
  def addItem(item:Item) {
    items += item
  }
}
