public class StarsModified {       

  int MAX_ROWS = 15;
  
  public void setRows(int k){
    MAX_ROWS = k;
  }  
  
  public void leftTriangle(){
   
    for (int row = 1; row <= MAX_ROWS; row++){
      
      for (int star = 1; star <= row; star++)
        System.out.print ("*");             
      
      System.out.println();          
    } 
  }
  
  public void rightTriangle(){
    
   for (int row = 1; row <= MAX_ROWS; row++){
      
      for (int star = 1; star <= Math.abs(row-MAX_ROWS); star++)
        System.out.print ("*");  
      
      System.out.println();          
    } 
  }
  
  public void flippedTriangle(){
    int spaces = 0;   
    
    for (int row = 1; row <= MAX_ROWS; row++){
      
      spaces = Math.abs(row-MAX_ROWS);
      for(int x = 0; x < spaces; x++)
          System.out.print(" ");
      
      for (int star = 1; star <= row; star++){
        System.out.print ("*");
      }             
      
      System.out.println();          
    } 
  }
  
  public void isoTriangle(){
    int spaces = 0;   
    
    for (int row = 1; row <= MAX_ROWS*2; row+=2){
      
      spaces = Math.abs(row-MAX_ROWS*2)/2;
      for(int x = 0; x < spaces; x++)
          System.out.print(" ");
      
      for (int star = 1; star <= row; star++){
        System.out.print ("*");
      }             
      
      System.out.println();          
    } 
  }
  
  public void Diamond(){ 
    
    int spaces = 0;   
    int endline = 0;
    
    //Top of triangle code
    for (int row = 1; row <= MAX_ROWS; row+=2){
      
      spaces = Math.abs(row-MAX_ROWS)/2;
      for(int x = 0; x < spaces; x++)
          System.out.print(" ");
      
      for (int star = 1; star <= row; star++){
        System.out.print ("*");
      }             
      
      System.out.println();   
    }
   
    
    //bottom of triagle
    for (int row = ((int)(MAX_ROWS/2))-1; row >= 0; row--){
      
      spaces = Math.abs(row-((int)(MAX_ROWS/2)));
      for(int x = 0; x < spaces; x++)
          System.out.print(" ");
      
      for (int star = 1; star < row*2; star++){
        System.out.print ("*");
      }             
      
      System.out.println();          
    } 
  }
  

  
  
}