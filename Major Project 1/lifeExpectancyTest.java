
import java.util.Scanner;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class lifeExpectancyTest{

  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
    
    //Format for the dates
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
    Calendar currentDate = Calendar.getInstance(); //By default it is the current date
    
    //Holds information about the user
    String gender = "";
    boolean isMale = false;
    Calendar dateBorn = Calendar.getInstance();
    
    //Prompts the user to enter information and describes the program
    System.out.println("Hello! Welcome to the life expectency calculator.\nBased on your age, gender, and statisical averages I will predict how much time you have left on this Earth.\nToday's date is: "+ currentDate.getTime());
    System.out.println("Enter your birthdate (mm/dd/yy): ");
    //Asks for date, and asks to try again if not a valid date
    boolean getDate = true;
      while(getDate){
      try{
        dateBorn.setTime(dateFormat.parse(scan.nextLine()));
        getDate = false;
      }catch(Exception e){System.out.println("Couldn't get a valid date! Try again");};
    }
    
    //Convers gender to boolean
    boolean getGender = true;
    while (getGender){
    
    //Keeps prompting for gender until valid one is entered
    System.out.println("Enter your gender (Male of Female): ");
    gender = scan.nextLine();
      
    if (gender.toUpperCase().equals("MALE") || gender.toUpperCase().equals("M")){isMale = true; getGender = false;}
    else if (gender.toUpperCase().equals("FEMALE") || gender.toUpperCase().equals("F")){isMale = false; getGender = false;}
    }
    
 
    //Creates a new lifeExpectancy object based on the information
    lifeExpectancy life = new lifeExpectancy(dateBorn, currentDate, isMale);
    System.out.println(life);
    life.displayGraphicalOutput();
  
  }

}