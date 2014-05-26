def sum(args: Int*): Int = {
  if(args.length == 0) 0 else args.head + sum(args.tail: _*)
}
