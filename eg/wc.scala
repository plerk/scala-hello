val words = new scala.collection.mutable.HashMap[String,Int]
val in = new java.util.Scanner(new java.io.File("myfile.txt"))
while(in.hasNext()) {
  val word = in.next().replaceAll("""[^A-Za-z]+""", "").toLowerCase;
  if(word.isEmpty)
    ()
  else if(words.contains(word))
    words(word) += 1
  else
    words(word) = 1
}

for(k <- words.keySet.toSeq.sorted)
  println(k + "=" + words(k))
