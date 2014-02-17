import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class againstPerson{

  private char boardArray[][] = { {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '} };
  private char player1Letter;
  private char player2Letter;
  private Scanner scan = new Scanner(System.in);
  private Random rand = new Random();
  private boolean gameOver = false;
  private boardFunctions functions = new boardFunctions(boardArray);
  
  public againstPerson(){
  
  }
  
  public void run(){
  
    System.out.println("Would Player 1 like to be [1] X's or [2] O's?");
    int r1 = scan.nextInt();
    //Determins the players letter
    if(r1 == 1){
      player1Letter = 'X';
      player2Letter = 'O';
    }else{
      player1Letter = 'O';
      player2Letter = 'X';
    }
    
    System.out.println("Lets play! To insert a letter, type in its corresponding number value on the board.");
    
    boolean player1Moved = false;
    int whoGoesFirst = rand.nextInt(2);
    if(whoGoesFirst == 0){
      System.out.println("I have randomly decided that Player 1 goes first.");
      player1Moved = false;
    }else{
      System.out.println("I have randomly decided that Player 2 goes first.");
      player1Moved = true;
    }
    functions.printBoard();
    for(int c = 0; c < 9; c++){
      if(player1Moved){
        if(!gameOver)player2Move();
        player1Moved = false;
      }
      else{
        if(!gameOver)player1Move();
        player1Moved = true;
      }
    }
    if(!gameOver)System.out.println("It's a tie. Player 1 and Player 2 are equally matched.");
    
    

  }
  
  
  public void player1Move(){
     
     System.out.println("\n\nPlayer 1 choose a square");
     int move = scan.nextInt();
     int[] array = functions.getCoordinates(move);
     
     int x = array[0];
     int y = array[1];
    
    if(boardArray[x][y] == ' '){
       boardArray[x][y] = player1Letter;}
    else{
      while(boardArray[x][y] != ' '){
         System.out.println("\n\nSpace already taken, try again.");
         move = scan.nextInt();
         array = functions.getCoordinates(move);
     
         x = array[0];
         y = array[1];
      }
      boardArray[x][y] = player1Letter;
    }
    
    functions.printBoard();
    if(functions.checkForWin()){
       System.out.println("Player 1 wins! Player 2 should feel ashamed...");
       gameOver = true;
    }
    
  }
  
  public void player2Move(){
     
     System.out.println("\n\nPlayer 2 choose a square");
     int move = scan.nextInt();
     int[] array = functions.getCoordinates(move);
     
     int x = array[0];
     int y = array[1];
    
    if(boardArray[x][y] == ' '){
       boardArray[x][y] = player2Letter;}
    else{
      while(boardArray[x][y] != ' '){
         System.out.println("\n\nSpace already taken, try again.");
         move = scan.nextInt();
         array = functions.getCoordinates(move);
     
         x = array[0];
         y = array[1];
      }
      boardArray[x][y] = player2Letter;
    }
    
    functions.printBoard();
    if(functions.checkForWin()){
       System.out.println("Player 2 wins! Better luck next time player 1.");
       gameOver = true;
    }
    
  }
  



}