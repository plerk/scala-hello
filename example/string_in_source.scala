for(line <- scala.io.Source.fromFile("mynumber.scala").getLines.toSeq; str <- "\"([^\"]|\\\")*\"".r.findAllIn(line)) println(str)
