object Suit extends Enumeration {
  val Club    = Value("♣")
  val Diamond = Value("♦")
  val Heart   = Value("♥")
  val Spade   = Value("♠")
}

def colorIsRed(suit:Suit.Value) = suit == Suit.Diamond || suit == Suit.Heart
