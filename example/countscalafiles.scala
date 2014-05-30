println(new java.io.File(".").listFiles.toSeq.map { _.getCanonicalFile }.filter { file => file.isFile && file.getName.endsWith(".scala") }.length)
