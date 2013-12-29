import java.util.Scanner;   
import java.text.DecimalFormat;

public class ShapeCalculator{

  public static void main (String[] args){
 
     Scanner scan = new Scanner (System.in); //Creates scanner object
     DecimalFormat decimal = new DecimalFormat ("0.###"); //Creates a decimal format object with 3 places
     
     System.out.println("This program calculates the surface area and volume of a shape!\nWhat shape would you like to use? (Enter the corresponding number)");
     System.out.println("[1. Cylinder] [2. Square Pyramid] [3. Cone] [4. Quit Program]");
   
     int entry = scan.nextInt();
     
     while (entry < 4){//Keeps letting user select shapes until the program terminates
     
       //Runs cylinder program
       if(entry == 1){
       
         System.out.println("Enter the cylinder's radius and height.");
         System.out.print("Radius: "); //Prompts user for radius
         double radius = scan.nextDouble();
         System.out.print("Height: "); //Prompts user for height
         double height = scan.nextDouble();
         
         //Creates cylinder
         cylinder c = new cylinder(radius, height);
         
         //Displays calculations
         System.out.println("Surface Area: "+decimal.format(c.getSurfaceArea())+"\nVolume: "+decimal.format(c.getVolume()));
         
       }
       
       //Runs square pyramid program
       if(entry == 2){
       
         System.out.println("Enter the Square Pyramid's base length and height.");
         System.out.print("Base: "); //Prompts user for base length
         double base = scan.nextDouble();
         System.out.print("Height: "); //Prompts user for height
         double height = scan.nextDouble();
         
         //Creates square pyramid
         SquarePyramid pyramid = new SquarePyramid(base, height);
         
         //Displays calculations
         System.out.println("Surface Area: "+decimal.format(pyramid.getSurfaceArea())+"\nVolume: "+decimal.format(pyramid.getVolume()));
         
       }
       
       
       //Runs cone program
       if(entry == 3){
       
         System.out.println("Enter the Cone's base radius and height.");
         System.out.print("Radius: "); //Prompts user for radius
         double radius = scan.nextDouble();
         System.out.print("Height: "); //Prompts user for height
         double height = scan.nextDouble();
         
         //Creates cone
         Cone cone = new Cone(radius, height);
         
         //Displays calculations
         System.out.println("Surface Area: "+decimal.format(cone.getSurfaceArea())+"\nVolume: "+decimal.format(cone.getVolume()));
         
       }
       
       System.out.println("[1. Cylinder] [2. Square Pyramid] [3. Cone] [4. Quit Program]");
       entry = scan.nextInt();
     
     }
    
  }
  
}