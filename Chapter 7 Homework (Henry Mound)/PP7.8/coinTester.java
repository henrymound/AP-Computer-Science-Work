public class coinTester{

  public static void main(String[] args){
  
    //Creates a coin and runs a series of tests.
    Coin coin1 = new Coin();
    System.out.println("Coin being created");
    System.out.println("Setting coin key");
    
    coin1.setKey(6552);
    System.out.println();
    System.out.println("Locking account");
    
    coin1.lock(6552);
    System.out.println();
    System.out.println("Trying to lock account with an incorrect key");
    
    coin1.unlock(7);
    System.out.println();
    System.out.println("Trying to flip a locked coin");
 
    coin1.flip();
    System.out.println();
    System.out.println("Unlocking account with a correct key.");
    
    coin1.unlock(6552);
    System.out.println("\nFlipping coin");
    coin1.flip();
    
  
  }

}