public class BoxCars{

  public static void main(String[] args){
  
    PairOfDice pair = new PairOfDice();
    final int NUM_OF_ROLES = 1000;
    int numOfBoxCars = 0;
    
    for(int x = 0; x < NUM_OF_ROLES; x++){
      pair.rollDice();
      if(pair.getDie1() == 6 && pair.getDie2() == 6)
        numOfBoxCars++;
    }
    
    System.out.println("Out of 1000 roles, there were "+numOfBoxCars+" box cars.");
    
    double percent = ((double)numOfBoxCars/(double)NUM_OF_ROLES) * 100;//Calculates the percent success rate
    System.out.println("That's a "+percent+"% success rate");
    
  }

}