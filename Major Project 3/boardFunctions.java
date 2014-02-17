import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class boardFunctions{
  
  private char[][] boardArray;
  
  public boardFunctions(char[][] x){
     boardArray = x;
  }  

  public void printBoard(){
  
    System.out.println(" "+boardArray[0][0]+" | "+boardArray[0][1]+" | "+boardArray[0][2]+" ");
    System.out.println("-----------");
    System.out.println(" "+boardArray[1][0]+" | "+boardArray[1][1]+" | "+boardArray[1][2]+" ");
    System.out.println("-----------");
    System.out.println(" "+boardArray[2][0]+" | "+boardArray[2][1]+" | "+boardArray[2][2]+" ");
    
  }
  
  public int[] getCoordinates(int x){
    int[] y = new int[2];
    
    switch (x){
    case 1:
      y[0] = 0;
      y[1] = 0;
      break;
    case 2:
      y[0] = 0;
      y[1] = 1;
      break;
    case 3:
      y[0] = 0;
      y[1] = 2;
      break;
    case 4:
      y[0] = 1;
      y[1] = 0;
      break;
    case 5:
      y[0] = 1;
      y[1] = 1;
      break;
    case 6:
      y[0] = 1;
      y[1] = 2;
      break;
    case 7:
      y[0] = 2;
      y[1] = 0;
      break;
    case 8:
      y[0] = 2;
      y[1] = 1;
      break;
    case 9:
      y[0] = 2;
      y[1] = 2;
      break;
      
       }
    
    return y;
  
  }
  
  public boolean checkForWin(){
    char letterToCheck = 'X';
    boolean win = false;
    for(int x = 0; x < 2; x++){
      if(//horizontal wins
         ((boardArray[0][0] == boardArray[0][1]) && (boardArray[0][1] == boardArray[0][2]) && (boardArray[0][0] == letterToCheck) )||
         ((boardArray[1][0] == boardArray[1][1]) && (boardArray[1][1] == boardArray[1][2]) && (boardArray[1][0] == letterToCheck) )||
         ((boardArray[2][0] == boardArray[2][1]) && (boardArray[2][1] == boardArray[2][2]) && (boardArray[2][0] == letterToCheck) )||
         //verticle wins
         ((boardArray[0][0] == boardArray[1][0]) && (boardArray[1][0] == boardArray[2][0]) && (boardArray[0][0] == letterToCheck) )||
         ((boardArray[0][1] == boardArray[1][1]) && (boardArray[1][1] == boardArray[2][1]) && (boardArray[0][1] == letterToCheck) )||
         ((boardArray[0][2] == boardArray[1][2]) && (boardArray[1][2] == boardArray[2][2]) && (boardArray[0][2] == letterToCheck) )||
         //diagonal wins
         ((boardArray[0][0] == boardArray[1][1]) && (boardArray[1][1] == boardArray[2][2]) && (boardArray[0][0] == letterToCheck) )||
         ((boardArray[0][2] == boardArray[1][1]) && (boardArray[1][1] == boardArray[2][0]) && (boardArray[0][2] == letterToCheck) )
        )//checks all winning possibilities
          win = true;
       letterToCheck = 'O';
    }
    return win;
  
  }


}