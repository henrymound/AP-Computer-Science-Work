import java.util.Scanner;

public class MovieRating{
    public static void main (String[] args){
      
        final int PG13 = 13;
        final int R = 17;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("Enter your age: ");
        int age = scan.nextInt();
        
        System.out.println ("You entered: " + age);
        
        if(age >= R)
          System.out.println("You can see 'G', 'PG', 'PG-13', 'R', and even NC-17 movies!");
        else if (age >= PG13)
          System.out.println ("You can see PG-13 movies, PG movies, G movies, and even R movies (if you are with a parent.)");
        else
          System.out.println ("You're pretty young. On the bright side, you can always see 'G', and PG movies if your parents are warned!");
    }
    
}