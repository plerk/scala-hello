import scala.collection.JavaConversions.propertiesAsScalaMap
val prop :scala.collection.mutable.Map[String,String] = java.lang.System.getProperties()

val max = prop.keys.map { _.length }.max

for((k,v) <- scala.collection.immutable.SortedMap(prop.toSeq:_*))
  println(k + " " * (max - k.length) + " | " + v)
