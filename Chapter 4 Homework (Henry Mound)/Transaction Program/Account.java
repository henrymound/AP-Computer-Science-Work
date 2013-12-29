import java.text.NumberFormat;

public class Account {
  
  private final double RATE = 0.035;  // interest rate of 3.5%
  private long acctNumber;
  private double balance;
  private String name;
  
  //Sets up the account by defining its attributes
  public Account (String owner, long account, double initial)    {
    name = owner;
    acctNumber = account;
    balance = initial; 
  }

  // Deposits a specified amount into the account and eturns the new balance
  public double deposit (double amount){
    balance = balance + amount;
    return balance;  
  }
  
  // Adds interest and returns the new balance
  public double addInterest ()    {
    balance += (balance * RATE);
    return balance; 
  }
  
  // Returns the balance of the account
  public double getBalance ()    {
    return balance; 
  }
  
  public double withdraw (double amount, double fee){
    balance = balance - amount - fee;
    return balance;    
  }
  
  //Returns a one line description of the acount
  public String toString ()    {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    return acctNumber + "\t" + name + "\t" + fmt.format(balance);
  } 
}
  
  