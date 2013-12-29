import java.util.Scanner;

public class SquareCalc{
  
   public static void main (String[] args){
     
      Scanner scan = new Scanner (System.in);

      System.out.println("Enter the length of a square's side: ");
      int squareSide = scan.nextInt();
      
      int perimeter = squareSide * 4;
      int area = squareSide * squareSide;
      
      System.out.println ("The Perimeter of your square is: "+ perimeter);
      System.out.println ("The Area of your square is: "+ area);
      
   }
}