import java.util.Scanner;

public class SkiSlopeRunner{

  public static void main (String[] args){
  
    int x1, x2, y1, y2;
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter in the values of x1, x2, y1, and y2 so I can calculate the slope!");
    
    //Sets variables from users input
    
    System.out.println("Enter X1: ");
    x1 = scan.nextInt();
    scan.nextLine();
            
    System.out.println("Enter X2: ");
    x2 = scan.nextInt();
    scan.nextLine();
    
    System.out.println("Enter Y1: ");
    y1 = scan.nextInt();
    scan.nextLine();
    
    System.out.println("Enter Y2: ");
    y2 = scan.nextInt();
    scan.nextLine();
    
    Slope slope = new Slope(x1, x2, y1, y2);
    System.out.println("The slope of the points ("+x1+", "+y1+") and ("+x2+", "+y2+") is: "+slope.calculateSlope()+"%.");
    System.out.println("We rate this slope as "+ slope.slopeRating()+".");
    
    
  }

}