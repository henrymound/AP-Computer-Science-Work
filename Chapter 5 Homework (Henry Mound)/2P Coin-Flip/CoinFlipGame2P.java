import java.util.Scanner;

public class CoinFlipGame2P{

  public static void main(String[] args){
  
    char playStatus = 'y';
    Scanner scan = new Scanner(System.in);
    
    while(playStatus == 'y'){//keeps executing while the user wants to
      
      Coin player1 = new Coin(); //Creates a new coin   
      Coin player2 = new Coin();
      
      player1.flip();
      System.out.println("Flipping coin 1..." + player1);

      player2.flip();
      System.out.println("Flipping coin 2..." + player2);
      System.out.println(getResult(player1, player2));
      
      System.out.println("Would you like to play again? (y/n)");
      String response = scan.next();
      System.out.println();
  
      if(response.equals("yes") || response.equals("y")){
        playStatus = 'y';
      }else{playStatus = 'n';}
    
   }
  
  }
  
  public static String getResult(Coin coin1, Coin coin2){//Returns the match results
  
    String result = "";
    
    if((coin1.isHeads() && coin2.isHeads()) || (coin1.isTails() && coin2.isTails())){result = "It was a tie!";}//tie result
    
    else if(coin1.isHeads() && coin2.isTails()){result = "Coin 1 is the winner!";}//returns winners    
    else if(coin1.isTails() && coin2.isHeads()){result = "Coin 2 is the winner!";}//returns winners
    
    return result;
    
  }
  
}
