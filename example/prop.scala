import scala.collection.JavaConversions.propertiesAsScalaMap
val prop :scala.collection.mutable.Map[String,String] = java.lang.System.getProperties()

for((k,v) <- scala.collection.immutable.SortedMap(prop.toSeq:_*))
  println(k + "=" + v)
