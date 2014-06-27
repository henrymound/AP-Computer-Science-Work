public class Transactions {    

//Creates some bank accounts and requests execute services.
 
  public static void main (String[] args)    {       
    
    Account acct1 = new Account ("Ted Murphy", 72354, 102.56);       
    Account acct2 = new Account ("Jane Smith", 69713, 40.00);       
    Account acct3 = new Account ("Edward Demsey", 93757, 759.32);   
    //New account type with just two parameters
    Account acct4 = new Account ("Henry Mound", 57281);       
    
    System.out.println("Henry Balance after initial creation: " + acct4.getBalance());
    acct4.deposit(7.14);
    acct4.setKey(443245);
    System.out.println("Setting the key on the 'Henry' account.\n");
    System.out.println("Locking the 'Henry' account.");
    acct4.lock(443245);
    System.out.println();
    System.out.println("Trying to deposit money to a locked account.");
    acct4.deposit(50);
    System.out.println();
    System.out.println("Unlocking account with an invalid key");
    acct4.unlock(32);
    System.out.println();
    System.out.println("Unlocking account, and then depositing money.");
    acct4.unlock(443245);
    acct4.deposit(50);
    System.out.println("Henry Balance after deposit: " + acct4.getBalance() + "\n");
    acct1.deposit (25.85);       
    double smithBalance = acct2.deposit (500.00);       
    System.out.println ("Smith balance after deposit: " + smithBalance);       
    System.out.println ("Smith balance after withdrawal: " + acct2.withdraw(430.75, 1.50));
    acct1.addInterest();       
    acct2.addInterest();       
    acct3.addInterest();       
    
    System.out.println ("\n"+acct1);
    System.out.println (acct2);       
    System.out.println (acct3);
    
  }
  
}