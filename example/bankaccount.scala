class BankAccount {
  protected var mybalance = 0
  
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

class CheckingAccount extends BankAccount {
  override def deposit(value:Int) {
    super.deposit(value)
    mybalance -= 1
  }
  
  override def withdraw(value:Int) {
    super.withdraw(value)
    mybalance -= 1
  }
}

class SavingsAccount extends BankAccount {
  private var transactionCount = 3
  
  private def transactionLimitCheck() {
    if(transactionCount == 0)
      throw new Exception("transaction count exteeded!")
    transactionCount += 1
  }
  
  override def deposit(value:Int) {
    transactionLimitCheck()
    super.deposit(value)
  }
  
  override def withdraw(value:Int) {
    transactionLimitCheck()
    super.withdraw(value);
  }
  
  def earnMonthlyInterest() {
    mybalance = (mybalance * 1.03).toInt
    transactionCount = 3
  }
}
