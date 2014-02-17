import java.util.Scanner;

public class Main{

  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int input = -1;
    
    while (input < 0){
       System.out.println("Enter the size of the magic square: ");
       input = scan.nextInt();
       
       if(input < 0)
         System.out.println("Please enter a positive number.");
    
    }
    
    MagicSquare square = new MagicSquare(input);
    square.create();
    System.out.println(square);
  
  }


}