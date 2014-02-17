import java.util.Scanner;  
import java.util.Random;  

public class SlotMachine{

  public static void main (String[] args){
    
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();
    
    int numOne, numTwo, numThree;
    boolean keepPlaying = true;
    String toPlay = "";
    
    while(keepPlaying){
      
      System.out.println("Let's Play Slots! (y/n)");
      toPlay = scan.next();
      
      if(toPlay.toLowerCase().equals("y")){
        keepPlaying = true;
      }else if(toPlay.toLowerCase().equals("n")){
        keepPlaying = false;
        break;
      }
      
      numOne = generator.nextInt(10);    
      numTwo = generator.nextInt(10);    
      numThree = generator.nextInt(10);
      System.out.println(numOne+", "+numTwo+", "+numThree);
      
      if(numOne == numTwo && numTwo == numThree){
        System.out.println("WINNER!! YOU GOT THREE OF THE SAME!\n");
      }else if(numOne == numTwo || numOne == numThree || numTwo == numThree){
        System.out.println("You Won! Two of the same!\n");
      }else{
        System.out.println("You didn't win anything...\n");
      }
      
    }
    
    
    
  }
  
}