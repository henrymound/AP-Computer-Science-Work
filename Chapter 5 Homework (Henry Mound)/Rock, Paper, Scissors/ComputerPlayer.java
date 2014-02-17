public class ComputerPlayer{

  public ComputerPlayer(){
  
  
  }
  
  public String getComputerMove(){
    int computerMoveInt;
    String compMove = "";
    
    computerMoveInt = randomInt(1, 3);
    
    if(computerMoveInt == 1){
      compMove = "Rock";
    } else if(computerMoveInt == 2){
      compMove = "Paper";
    } else if(computerMoveInt == 3){
      compMove = "Scissors";
    }
    
    return compMove;
    
  }
  
  public int randomInt(int lowEnd, int highEnd){
    int rnd;
    rnd = (int)(Math.random() * (highEnd - lowEnd+1)) + lowEnd;
    return rnd;
  }

}