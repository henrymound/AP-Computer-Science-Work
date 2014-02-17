import java.util.Scanner;

public class ticTacToe{
 
  public static void main(String[] args){
  
    boolean againstComputer = false;
    boolean keepPlaying = true;
    
    System.out.println("-------------TIC TAC TOE-------------");
    System.out.println("\n[1] Play against computer\n[2] Play against another human");
    Scanner scan = new Scanner(System.in);
    int response1 = scan.nextInt();
    
    if(response1 == 1)
      againstComputer = true;
    else againstComputer = false;
    
    while(keepPlaying){
    
    if(againstComputer){
      againstComputer aC = new againstComputer();
      aC.run();
    }else{
      againstPerson aP = new againstPerson();
      aP.run();
    }
    
    System.out.println("\n\nWould you like to play again? [1] Yes [2] No");
    int r2 = scan.nextInt();
    if (r2 == 2){
      keepPlaying = false;
      System.out.println("Thanks for playing! Seeya later.");
      break;}
    
    System.out.println("\n[1] Play against computer\n[2] Play against another human");
    response1 = scan.nextInt();
    
    if(response1 == 1)
      againstComputer = true;
    else againstComputer = false;
    }
    
  }
  

}