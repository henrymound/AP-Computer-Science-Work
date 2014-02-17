import java.text.NumberFormat;

public class Account implements Lockable{
  
  private final double RATE = 0.035;  // interest rate of 3.5%
  private boolean locked = false;
  private int accountKey;
  private long acctNumber;
  private double balance;
  private String name;
  
  //Sets up the account by defining its attributes
  protected Account (String owner, long account, double initial){
    if(!locked){
      name = owner;
      acctNumber = account;
      balance = initial; 
    }
  }
  
  //Sets up an account with just the owner and account variables, sets the default balance as $0.00
  protected Account (String owner, long account) {
    if(!locked){
      name = owner;
      acctNumber = account;
      balance = 0.00; 
    }
  }

  // Deposits a specified amount into the account and eturns the new balance
  protected double deposit (double amount){
    if(!locked){
      balance = balance + amount;
      return balance;  
    }else{System.out.println("Can't complete deposit, account locked.");return 0.0;}
  }
  
  // Adds interest and returns the new balance
  protected double addInterest (){
    if(!locked){
      balance += (balance * RATE);
      return balance; 
    }else return 0.0;
  }
  
  // Returns the balance of the account
  protected double getBalance () {
    if(!locked){
      return balance;
    }else return 0.0;
  }
  
  protected double withdraw (double amount, double fee){
    if(!locked){
      balance = balance - amount - fee;
      return balance; 
    }else return 0.0;
  }
  
  //Returns a one line description of the acount
  public String toString () {
      if(!locked){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return acctNumber + "\t" + name + "\t" + fmt.format(balance);
      }else return "Account Locked";
  }
  
  public void setKey(int key){
     if(!locked){
       accountKey = key;
       locked = false;}else{
       System.out.println("Please unlock the account before setting the key.");}
  }
  
  public void lock(int key){
    if(key != accountKey){
      System.out.println("Invalid Key.");
      locked = false;
      return;}
    else{
      System.out.println("Account Locked.");
      locked = true;
    }
  }
  
  public void unlock(int key){
      if(key != accountKey){
        System.out.println("Invalid Key.");
        locked = false;
        return;}
    else{
      System.out.println("Account Unlocked.");
      locked = false;
    }
  }
  
  public boolean locked(){
   return locked;  
  }

}
  
  