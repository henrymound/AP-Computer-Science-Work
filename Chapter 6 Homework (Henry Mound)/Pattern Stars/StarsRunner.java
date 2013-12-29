public class StarsRunner{

  public static void main(String[] args){
  
    StarsModified stars = new StarsModified();
    
    stars.setRows(20);//set row number
    
    stars.rightTriangle();
    stars.leftTriangle();
    stars.flippedTriangle();
    stars.isoTriangle();
    stars.Diamond();
  
  }
}