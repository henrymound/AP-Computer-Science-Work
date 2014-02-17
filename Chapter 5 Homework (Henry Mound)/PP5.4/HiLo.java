import java.util.Scanner;

public class HiLo{
  
  public static void main(String args[]){
  
    int input = 1; //Guess value
    
    int keepPlaying = 1; //Value for continuing to play
    String playing = "";
    
    int counter = 1; //Counts number of guesses
    int rand = (int)(Math.random() * 100) + 1; //Number generated between 0 and 100
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Guess a number between 1 and 100 (0 to quit)");
    
    while(keepPlaying!=0){
    
      while(input != 0){
        
        if(input == rand && counter!= 1){
          System.out.println("You guessed it in "+counter+" guesses! The number was "+rand+".");
          break;
        }else{
          if(input > rand  && counter!= 1){System.out.println("Nope try again, but try guessing lower");}
          else if(rand > input  && counter!= 1){System.out.println("Nope try again, but try guessing higher");}
        }
        
        input = scan.nextInt();
        counter++;
        
      }
      
      System.out.println("Do you want to keep playing? (y/n)");
      playing = scan.next();
      
      if(playing.equals("y")){  
        keepPlaying = 1;
        rand = (int)(Math.random() * 100) + 1;
        counter = 1;
        input = 1;
        System.out.println("Guess a number between 1 and 100 (0 to quit)");
        input = scan.nextInt();
        playing = "other"; 
      }else{
        keepPlaying = 0;
      }
      
    }
    
  }
  
}