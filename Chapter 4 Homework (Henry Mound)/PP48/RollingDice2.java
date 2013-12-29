public class RollingDice2{

  public static void main(String[] args){
  
    PairOfDice firstPair = new PairOfDice();
    firstPair.rollDice();
    System.out.println(firstPair);
    
    firstPair.setValue1(6);
    System.out.println(firstPair);
  
  }

}