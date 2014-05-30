val out = new java.io.PrintWriter("numbers.txt")
for( i <- 0 to 20) out.println("%3d %1.4f".format(i*i,1/i.toDouble))
out.close()

