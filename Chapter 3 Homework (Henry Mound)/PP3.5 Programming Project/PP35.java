import java.util.Scanner;
import java.text.DecimalFormat;

public class PP35{
  
   public static void main (String[] args){
     
      Scanner scan = new Scanner (System.in);

      System.out.println("Enter the length of a sphere's radius: ");
      double sphereRadius = scan.nextDouble(); //Reads the users input of the sphere's radius
      DecimalFormat decimal = new DecimalFormat ("0.####"); //Creates a decimal format object with 4 places
      
      //Carries out the calculations for the formulas
      double volume = 4 * (Math.PI * (Math.pow(sphereRadius, 3)))/3;
      double surfaceArea = 4 * Math.PI * Math.pow(sphereRadius, 2);
      
      //Prints out the volume and surface area
      System.out.println ("The volume of your sphere is: "+ decimal.format(volume));
      System.out.println ("The surface area of your sphere is: "+ decimal.format(surfaceArea));
      
   }
}