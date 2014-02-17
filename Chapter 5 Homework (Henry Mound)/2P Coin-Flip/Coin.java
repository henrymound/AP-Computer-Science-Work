
  public class Coin{

  //fields
  private final int HEADS = 1;
  private final int TAILS = 2;
  private int face;
  
  //contructor
  public Coin(){}
  
  //methods
    
  public void flip(){  
    face = (int)((Math.random() * 2)+1);
  }

  public boolean isTails(){
    return (face == TAILS);
  }
  
  public boolean isHeads(){
    return (face == HEADS);
  }
  
  public String toString(){
    
    String faceName;
     
    if(face == HEADS){
      faceName = "Heads";
    }else{
      faceName = "Tails";
    }
    
    return faceName;
    
  }
  
}