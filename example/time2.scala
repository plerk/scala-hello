class Time(hrs:Int, min:Int) {

  if(hrs < 0 || hrs > 23)
    throw new Exception("Hours must be between 0 and 23");

  if(min < 0 || min > 59)
    throw new Exception("Minutes must be between 0 and 59");

  private val minutes = hrs*60 + min

  def before(other: Time) = other.minutes > minutes

  override def toString() = "%02d:%02d".format(minutes / 60, minutes %60)

}
