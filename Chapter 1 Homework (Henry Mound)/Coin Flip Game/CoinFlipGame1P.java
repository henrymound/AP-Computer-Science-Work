public class CoinFlipGame1P{

  public static void main(String[] args){
  
    Coin henrysCoin = new Coin(); //Creates a new coin
    henrysCoin.flip();
    System.out.println(henrysCoin);
    
    if (henrysCoin.isHeads()){
      System.out.println("You Won!");
    }
    else{
      System.out.println("You Lose!");
    }
    
  }
  
}