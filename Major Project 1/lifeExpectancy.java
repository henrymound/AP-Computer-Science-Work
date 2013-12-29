import java.util.Date;
import java.util.Calendar;
import java.text.DecimalFormat;

public class lifeExpectancy{

  private int AVG_MALE_AGE = 76;//Predicted life expectancy (US)
  private int AVG_FEMALE_AGE = 81;
  private double yearsLeft;
  private double monthsLeft;
  private double weeksLeft;
  private int daysLeft;
  private long secondsLeft;
  private int Age;
  DecimalFormat formatter = new DecimalFormat("#,###");
  
  public lifeExpectancy(Calendar age, Calendar currentDate, boolean isMale){
    
    //Calculates how many years you have left based on age, and sex
    if(isMale) yearsLeft = ((AVG_MALE_AGE - (currentDate.get(Calendar.YEAR) - age.get(Calendar.YEAR)))); 
    if(isMale == false) {yearsLeft = (AVG_FEMALE_AGE - (currentDate.get(Calendar.YEAR) - age.get(Calendar.YEAR)));}
    Age = (currentDate.get(Calendar.YEAR) - age.get(Calendar.YEAR));

  }
  
  public double getYearsLeft(){
    return yearsLeft;
  }
  
  public double getMonthsLeft(){
    monthsLeft = yearsLeft * 12;
    return monthsLeft;
  }
  
  public double getWeeksLeft(){
    weeksLeft = yearsLeft * 52;
    return weeksLeft;
  }

  public int getDaysLeft(){
    daysLeft = (int)(yearsLeft * 365);
    return daysLeft;
  }
  
  public long getSecondsLeft(){
    secondsLeft = (long) (yearsLeft * 365 * 24 * 60 * 60);
    return secondsLeft;
  }
  
  public void displayGraphicalOutput(){
    //Prints out a graphical representation of your life
    System.out.println("This is how much time you have left (Each star represents a month): ");
    int lineBreak = (int)Math.sqrt(getMonthsLeft());//Determins when to create a new row in the graphic
    for (int x = 1; x < getMonthsLeft()+1; x++){
      System.out.print("* ");
      if (x % lineBreak == 0){System.out.println();}//Creates a new line after every row
    }
    System.out.println("\nValue every moment!");
  }
  
  public String toString(){
    //Returns data on how much time you have left in your expected life
    if(getSecondsLeft() > 0){
    return "You are "+Age+" years old."+
      "\nYou have "+formatter.format((int)getYearsLeft())+" years left."+
      "\nYou have "+formatter.format((int)getMonthsLeft())+" months left." +
      "\nYou have "+formatter.format((int)getWeeksLeft())+" weeks left." +
      "\nYou have "+formatter.format((int)getDaysLeft())+" days left." +
      "\nYou have "+formatter.format((int)getSecondsLeft())+" seconds left.";}
    else{return "You are escaping death!";}//Returns if you are older than predicted death
  }
  
}