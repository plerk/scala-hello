import scala.collection.immutable.SortedMap

def wc(in: java.util.Scanner = new java.util.Scanner(new java.io.File("myfile.txt"))): SortedMap[String,Int] = {
  if(in.hasNext()) {
    val word = in.next().replaceAll("""[^A-Za-z]+""", "").toLowerCase
    val words = wc(in)
    if(word.isEmpty)
      words
    else
      words + (word -> (words.getOrElse(word,0)+1))
  } else {
    SortedMap[String,Int]()
  }
}

val words = wc()

for((k,v) <- words)
  println(k + "=" + v)
