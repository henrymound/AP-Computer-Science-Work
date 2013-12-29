import java.util.Scanner;

public class TempConverter{
  
   public static void main (String[] args){
     
      Scanner scan = new Scanner (System.in);
     
      final int BASE = 32;
      final double CONVERSION_FACTOR = 9.0 / 5.0;
      
      double fahrenheitTemp;
      System.out.println("Enter Celsius Temperature: ");
      int celsiusTemp = scan.nextInt();
      
      fahrenheitTemp = BASE+(celsiusTemp * CONVERSION_FACTOR);
      
      System.out.println (celsiusTemp + "¡C is: " + fahrenheitTemp+"¡F");
      
   }
}