public class Die{

  private final int MAX = 6;
  private int value; //number on face of die
  
  public Die(){ //initializes the die
  value = 1;
  }
  
  public int roll(){//rolls the die by generating a random number between 1 and 6
  value = (int)(Math.random() * MAX) + 1;
  return value;
  }
  
  public void setValue(int v){//sets the value given an int
  value = v;}
  
  public int getValue(){//returns the value
  return value;}

  public String toString(){//returns the value as a string
  return Integer.toString(value);
  }
}