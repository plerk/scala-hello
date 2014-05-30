val r = """<img\s+[^>]*src="(.*?)"[^>]*>""".r
for(r(url) <- r.findAllIn(scala.io.Source.fromURL("https://www.wdlabs.com/twilight/recent").mkString))
  println(url)
