import java.util.ArrayList;
import java.util.*;

public class loops {
  
  public static void main (String[] args){
  
    //1. Name - Creates an arraylist of chars with all of the letters of my name
    //The program loops through and prints out all of the letters of my name.
    ArrayList<Character> lettersName = new ArrayList<Character>();
    lettersName.add('H');//Populates arrayList
    lettersName.add('e');
    lettersName.add('n');
    lettersName.add('r');
    lettersName.add('y');
    lettersName.add(' ');
    lettersName.add('M');
    lettersName.add('o');
    lettersName.add('u');
    lettersName.add('n');
    lettersName.add('d');
    
    int x = 0;
    while(x < lettersName.size()){
      System.out.print(lettersName.get(x));
      x++;
    }
    System.out.println();//skips a line
    
    //2 Count Down - A while loop that counts down from ten to zero, then prints "Blast Off"
    int countDown = 10;
    while(countDown > 0){
      System.out.println(countDown+"...");
      countDown--;}
    System.out.println("Blast Off!\n");
  
    //3 "Count Down" program with a for loop     
    for(int count = 10; count > 0; count--)
      System.out.println(count+"...");
    System.out.println("Blast Off!\n");
    
    //4 Shooping List - loops through array list and prints out shopping list
    ArrayList<String> BirthdayPartyItems = new ArrayList<String>(); 
    BirthdayPartyItems.add("Ice Cream Cake");//Populates list with 10 items
    BirthdayPartyItems.add("Gummy Bears");
    BirthdayPartyItems.add("Fruit Salad");
    BirthdayPartyItems.add("Smoked Salmon");
    BirthdayPartyItems.add("Brownies");
    BirthdayPartyItems.add("Chocolate");
    BirthdayPartyItems.add("Coffee");
    BirthdayPartyItems.add("Sparkling Cider");
    BirthdayPartyItems.add("Cheese");
    BirthdayPartyItems.add("Crackers");
    
    for(int y = 0; y < BirthdayPartyItems.size(); y++)
      System.out.println(BirthdayPartyItems.get(y));
    System.out.println();//skips a line
    
    //5 Prints even numbers from 1 to 50 using modules to detect evens
    int count = 1;
    while (count <= 50){
      if((count % 2) == 0)
        System.out.println(count);
      count++;}
    System.out.println();//skips a line
  
    //6 Prints out odd numbers from 100 to 0 usin modules to detect odds
    int oddCount = 100;
    while (oddCount >= 0){
      if((oddCount % 2) != 0)
        System.out.println(oddCount);
      oddCount--;}
    
    //7 Using a wile loop, counts the numbers of letters in a the large word "winebibber"
    String longWord = "winebibber";
    int last = "winebibber".length() - 1;
    int counter = 0;
    while (counter <= last)
      counter++;
    System.out.println("The length of the word \""+longWord+"\" is "+counter);
    
    //8 Using a loop, this program counts the numbers of 'o's in the word "saxicolous"
    last = "saxicolous".length() - 1;
    counter = 1;
    int oCounter = 0;
    while(counter <= last){
       if("saxicolous".substring(counter - 1, counter).compareTo("o") == 0)
         oCounter++;
       counter++;
    }
    System.out.println("The word saxicolous has "+oCounter+" o's in it.");
    
    //9 Generates 30 random grades for a semester course and prints out details about the results
    Random rand = new Random();
    ArrayList<String> grades = new ArrayList<String>();
    
    while(grades.size() < 30){
      switch(rand.nextInt(5)){
      case 0:
        grades.add("A");
        break;
      case 1:
        grades.add("B");
        break;
      case 2:
        grades.add("C");
        break;
      case 3:
        grades.add("D");
        break;
      case 4:
        grades.add("F");
        break;
      }
    }
    
    int ACounter = 0;
    int BCounter = 0;
    int CCounter = 0;
    int DCounter = 0;
    int FCounter = 0;
    int avgGrade = 0;
    
    for(int z = 0; z < grades.size(); z++){
      System.out.println("Item "+z+1+": "+grades.get(z));
      if(grades.get(z).equals("A")){
        ACounter++; avgGrade+=95;}
      if(grades.get(z).equals("B")){
        BCounter++; avgGrade+=85;}
      if(grades.get(z).equals("C")){
        CCounter++; avgGrade+=75;}
      if(grades.get(z).equals("D")){
        DCounter++; avgGrade+=65;}
      if(grades.get(z).equals("F")){
        FCounter++; avgGrade+=50;}
    }
    
    System.out.println("Number of A's: "+ACounter);    
    System.out.println("Number of B's: "+BCounter);    
    System.out.println("Number of C's: "+CCounter);    
    System.out.println("Number of D's: "+DCounter);    
    System.out.println("Number of F's: "+FCounter);    
    System.out.println("Average Percent Grade is: "+(double)(avgGrade/30) + "%");
    
    //10 sorts out a String array list lexographically
    System.out.println("\nThe Alphabetical Sorting Of Movie Stars Is: ");
    ArrayList<String> MovieStars = new ArrayList<String>();
    MovieStars.add("Seth McFarlane");
    MovieStars.add("Will Ferrell");
    MovieStars.add("Morgan Freeman");
    MovieStars.add("Seth Rogan");
    MovieStars.add("Stephen Colbare");
    MovieStars.add("John Stewart");
    MovieStars.add("Ricky Gervais");
    MovieStars.add("Stephen Merchant");
    MovieStars.add("Karl Pilkington");
    MovieStars.add("Steve Carell");

    for(x = 0; x < 26; x++){
      for(int y = 0; y < MovieStars.size(); y++){
        if(MovieStars.get(y).compareTo("A") == x)
          System.out.println(MovieStars.get(y));}
    }
    
    
  } 
  
  
}