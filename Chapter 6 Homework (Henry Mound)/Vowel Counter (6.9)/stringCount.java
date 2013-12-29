import java.util.*;

public class stringCount{

  public static void main(String [] args){
  
    int vowelA = 0;//Letter counters
    int vowelE = 0;
    int vowelI = 0;
    int vowelO = 0;
    int vowelU = 0;
    int consonant = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a phrase!");
    
    String phrase = scan.nextLine();
    char[] phraseChars = phrase.toCharArray();//Converts phrase to a character array
    
    //checks for vowels/non-vowels and updates counters
    for(int x = 0; x < phrase.length(); x++){
    
      switch(phraseChars[x]){
        
      case 'a':
        vowelA++;
        break;
      case 'e':
        vowelE++;
        break;
      case 'i':
        vowelI++;
        break;
      case 'o':
        vowelO++;
        break;
      case 'u':
        vowelU++;
        break;
      case ' '://doesn't count whitespace
        break;
      default:
        consonant++;
        
      }
        
    }
    
    //Displays the counter values
    System.out.println("Number of a's in your entered phrase: "+vowelA);
    System.out.println("Number of e's in your entered phrase: "+vowelE);
    System.out.println("Number of i's in your entered phrase: "+vowelI);
    System.out.println("Number of o's in your entered phrase: "+vowelO);
    System.out.println("Number of u's in your entered phrase: "+vowelU+"\n");
    System.out.println("Total number of vowels in your entered phrase: "+(vowelA+vowelE+vowelI+vowelO+vowelU));
    System.out.println("Number of non-vowels in your entered phrase: "+consonant);
    
    
  }

}