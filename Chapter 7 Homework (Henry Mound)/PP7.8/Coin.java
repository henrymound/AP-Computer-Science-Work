public class Coin implements Lockable{

  //fields
  private final int HEADS = 1;
  private final int TAILS = 2;
  private boolean locked = false;
  private int face;
  private int coinKey;
  
  //contructor
  public Coin(){}
  
  //methods
    
  public void flip(){
    if(!locked){
      face = (int)((Math.random() * 2)+1);
      System.out.println("Coin flipped");}
    else System.out.println("Could not flip because coin is locekd.");
  }

  public boolean isTails(){
    if(!locked)
        return (face == TAILS);
    else {System.out.println("Coin is locked");
         return false;}
  }
  
  public boolean isHeads(){
    if(!locked)
      return (face == HEADS);
    else {System.out.println("Coin is locked");
          return false;}
  }
  
  public String toString(){
    if(!locked){
      String faceName;
    
      if(face == HEADS){
        faceName = "Heads";
      }else{
        faceName = "Tails";
      }
      
      return faceName;
    }else System.out.println("Coin is locked");
    
    return ("Coin is locked");
  }
  
  public void setKey(int key){
    if(!locked){
       coinKey = key;
       System.out.println("Key set");}
    else{
       System.out.println("Account locked, could not set key.");
    }
  }
  
  public void lock(int key){
    if(coinKey == key){
       locked = true;
       System.out.println("Account locked.");
    }else{
       System.out.println("Could not lock account, invalid key");
       }
  }
  
  public void unlock(int key){
     if(key == coinKey){
       locked = false;
       System.out.println("Account unlocked.");
    }else{
       System.out.println("Could not unlock account, invalid key");
       }
  }
  
  public boolean locked(){
     return locked;
  }
  
}