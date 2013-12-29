public class PairOfDice{

  private final int MAX = 6;
  private int die1Value; //number on face of die 1
  private int die2Value; //number on face of die 2
  
  public PairOfDice(){ //initialize the dice
    die1Value = 1;
    die2Value = 1;
  }
    
  public int rollDice(){//rolls the die by generating a random number between 1 and 6
  die1Value = (int)(Math.random() * MAX) + 1;
  die2Value = (int)(Math.random() * MAX) + 1;
  return die1Value + die2Value;
  }
  
  public void setValue1(int v1){//sets the value of first die
  die1Value = v1;}
    
  public void setValue2(int v2){//sets the value of second die
  die2Value = v2;}
  
  public int getDie1(){//returns the value of first die
  return die1Value;}
  
  public int getDie2(){//returns the value of first die
  return die2Value;}

  public int getSum(){//Returns the sum of the two dice
  return die1Value + die2Value;
  }
  
  public String toString(){//returns the value as a string
  return "Die 1: "+Integer.toString(die1Value)+"\n"+
    "Die 2: "+Integer.toString(die2Value)+"\nSum: "+getSum();
  }

}