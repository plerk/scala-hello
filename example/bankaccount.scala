class BankAccount {
  private var mybalance = 0
  
  def balance = mybalance

  def deposit(value:Int) { 
    if(value < 0)
      throw new Exception("deposit must be positive")
    mybalance += value
  }
  
  def withdraw(value:Int) {
    if(value < 0)
      throw new Exception("withdraw must be positive")
    if(mybalance - value < 0)
      throw new Exception("bounce!")
    mybalance -= value 
  }
}
