import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class againstComputer{

  private char boardArray[][] = { {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '} };
  private char playerLetter;
  private char computerLetter;
  private Scanner scan = new Scanner(System.in);
  private Random rand = new Random();
  private boolean gameOver = false;
  private boardFunctions functions = new boardFunctions(boardArray);
  
  public againstComputer(){
  
  }
  
  public void run(){
  
    System.out.println("Would you like to be [1] X's or [2] O's?");
    int r1 = scan.nextInt();
    //Determins the players letter
    if(r1 == 1){
      playerLetter = 'X';
      computerLetter = 'O';
    }else{
      playerLetter = 'O';
      computerLetter = 'X';
    }
    
    System.out.println("Lets play! To insert a letter, type in its corresponding number value on the board.");
    
    boolean playerMoved = false;
    int whoGoesFirst = rand.nextInt(2);
    if(whoGoesFirst == 0){
      System.out.println("I have randomly decided that you go first.");
      playerMoved = false;
      functions.printBoard();
    }else{
      System.out.println("I have randomly decided that the computer goes first.");
      playerMoved = true;
    }

    for(int c = 0; c < 9; c++){
      if(playerMoved){
        if(!gameOver)computerMove();
        playerMoved = false;
      }
      else{
        if(!gameOver)playerMove();
        playerMoved = true;
      }
    }
    if(!gameOver)System.out.println("You have tied the computer.");
    
    

  }
  
  
  public void playerMove(){
     
     System.out.println("\n\nChoose a square");
     int move = scan.nextInt();
     int[] array = functions.getCoordinates(move);
     
     int x = array[0];
     int y = array[1];
    
    if(boardArray[x][y] == ' '){
       boardArray[x][y] = playerLetter;}
    else{
      while(boardArray[x][y] != ' '){
         System.out.println("\n\nSpace already taken, try again.");
         move = scan.nextInt();
         array = functions.getCoordinates(move);
     
         x = array[0];
         y = array[1];
      }
      boardArray[x][y] = playerLetter;
    }
    
    functions.printBoard();
    if(functions.checkForWin()){
       System.out.println("You won! You are better than a machine.");
       gameOver = true;
    }
    
  }
  
  public void computerMove(){
    System.out.println("\n\nComputer's turn");
    int[] check;
    ArrayList<Integer> emptySlots = new ArrayList<Integer>();

    for(int x = 0; x < 9; x++){
       check = functions.getCoordinates(x);
       if (boardArray[check[0]][check[1]] == ' ')
          emptySlots.add(x);
    }
    
    int pickMove = rand.nextInt(emptySlots.size());
    int move = emptySlots.get(pickMove);
    int[] coord = new int[2];
    coord = functions.getCoordinates(move);
    
    boardArray[coord[0]][coord[1]] = computerLetter;
    functions.printBoard();
    if(functions.checkForWin()){
       System.out.println("The computer won. Better luck next time...");
       gameOver = true;
    }
  
  }
 


}