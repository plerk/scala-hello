def base(c:Char) = 
  if('A' <= c && c <= 'Z') 
    'A' 
  else if('a' <= c && c <= 'z') 
    'a'
  else
    throw new Exception(c + " is not an English letter")

def caesarCrypt(s:String, key:Int=3) =
  for(c <- s) yield if(c == ' ') ' ' else ((((c-base(c))-key)%26)+base(c)).toChar

trait Logger {
  def log(msg:String)
}

trait CryptoLogger extends Logger {
  val key = 3
  def log(msg:String) { println(caesarCrypt(msg,key)) }
}

class Foo extends CryptoLogger {
  log("hello world")
}

new Foo

class Bar extends CryptoLogger {
  override val key = -3;
  log("hello world")
}

new Bar
