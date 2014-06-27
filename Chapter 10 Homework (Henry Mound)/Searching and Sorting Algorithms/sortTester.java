import java.util.Random;

public class sortTester{
  
  public static void main(String[] args){
    
    binary b = new binary();
    linear l = new linear();
    insertion i = new insertion();
    selection s = new selection();
    
    Comparable[] toSearch = {'A', 'C', 'D', 'E', 'J', 'L', 'N', 'W', 'X', 'T', 'O', 'P', 'R'};
    Random rand = new Random();
    Comparable toFind = 'C';
    
    System.out.println("Linear Search found C at Location: "+l.linearSearch(toSearch, toFind));
    System.out.println("Binary Search found C at Location: "+b.binarySearch(toSearch, toFind));
    
    System.out.print("Selection Sort Produced: ");
    Comparable[] selectionResult = s.selectionSort(toSearch);
    for(int x = 0; x < selectionResult.length; x++){
       System.out.print(selectionResult[x] +", ");
    }System.out.println();
   
    System.out.print("Insertion Sort Produced: ");
    Comparable[] insertionResult = i.insertionSort(toSearch);
    for(int x = 0; x < insertionResult.length; x++){
       System.out.print(insertionResult[x] +", ");
    }System.out.println();


    
  }
}