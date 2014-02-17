import java.util.Scanner;

public class RPSGame{

  public static void main (String args[]){
  
    char playStatus = 'y';
    Scanner scan = new Scanner(System.in);
    
    while(playStatus == 'y'){
    
    RPSGame game = new RPSGame();
    System.out.println("Hello! Welcome to the \"Rock, Paper, Scissors\" game!\n\nIt's your turn first.");
    game.playGame(); 
    
    System.out.println("Would you like to play again? (y/n)");
    String response = scan.next();
    
    if(response.equals("yes") || response.equals("y")){
      playStatus = 'y';
    }else{playStatus = 'n';}
    
   }
    
  }
  
  public void playGame(){
  
    String playerMove = "";
    String computerMove = "";
    String winner = "";
    
    HumanPlayer player1 = new HumanPlayer();//Gets the players move
    playerMove = player1.getPlayerMove();
    
    ComputerPlayer player2 = new ComputerPlayer();//Gets the computers move
    System.out.println("It's the computers turn!");
    computerMove = player2.getComputerMove();
    System.out.println("The computer chose: "+computerMove);
    
    System.out.println("\n" + playerMove + " Vs. " + computerMove);
    
    winner = determineRoundWinner(computerMove, playerMove);
    System.out.println(winner);
    
    
  }
  
  public String determineRoundWinner(String compMove, String playerMove){
  
    String statement = "";
    
    if(compMove.equals(playerMove)){statement =  "There was a tie.";}//Tie statement = 
    
    if(compMove.equals("Rock") && playerMove.equals("Scissors")){statement =  "Better luck next time, the computer won...";}//Computer winner statement = 
    if(compMove.equals("Paper") && playerMove.equals("Rock")){statement =  "Better luck next time, the computer won...";}
    if(compMove.equals("Scissors") && playerMove.equals("Paper")){statement =  "Better luck next time, the computer won...";}
    
    
    if(compMove.equals("Scissors") && playerMove.equals("Rock")){statement =  "Nice job, you won!";}//User winners statement = 
    if(compMove.equals("Rock") && playerMove.equals("Paper")){statement =  "Nice job, you won!";}
    if(compMove.equals("Paper") && playerMove.equals("Scissors")){statement =  "Nice job, you won!";}
    
    return statement;
  
    }

}