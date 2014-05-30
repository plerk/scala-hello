def sumAverageMinMax(seq:Seq[Double]) : (Double,Double,Double,Double) = {
  if(seq.length == 0)
    throw new Exception("No min, max or average of an empty sequence")
  else if(seq.length == 1)
    (seq.head, seq.head, seq.head, seq.head)
  else {
    val (sum,average,min,max) = sumAverageMinMax(seq.tail);
    (sum+seq.head,
     (sum+seq.head)/seq.length,
     if(seq.head < min) seq.head else min,
     if(seq.head > max) seq.head else max)
  }
}

val(sum, average, min, max) = sumAverageMinMax(scala.io.Source.fromFile("mynumber.txt").getLines.toSeq.map {_.toDouble})

println("sum     = " + sum)
println("average = " + average)
println("min     = " + min)
println("max     = " + max);

// 1.2
