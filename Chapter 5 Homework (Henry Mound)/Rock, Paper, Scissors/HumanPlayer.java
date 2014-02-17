import java.util.Scanner;

public class HumanPlayer{

  public HumanPlayer(){
  
  }
  
  public String getPlayerMove(){
  
    String playerMove = "";
    while(!playerMove.equals("ROCK") && !playerMove.equals("PAPER") && !playerMove.equals("SCISSORS")){
     
      System.out.println("['Rock', 'Paper', or 'Scissors'] Enter your move: ");
      Scanner scan = new Scanner(System.in);
      
      playerMove = scan.next();
      playerMove = playerMove.toUpperCase();
    }  
    
    if (playerMove.equals("ROCK")){playerMove = "Rock";}//Turns the string into a nicely formatted string
    if (playerMove.equals("PAPER")){playerMove = "Paper";}
    if (playerMove.equals("SCISSORS")){playerMove = "Scissors";}
    return playerMove;
  }

}