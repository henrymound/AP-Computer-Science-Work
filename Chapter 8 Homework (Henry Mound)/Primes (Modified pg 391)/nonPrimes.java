public class nonPrimes{

    private int[] nonPrimeNums = {1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20};
    
    public String toString(){
    String toReturn = "";
    toReturn += "The non-prime number array is " + nonPrimeNums.length + " numbers long.\n";
    toReturn += "The first few non-primes are: ";
    
      for (int nonPrime : nonPrimeNums)
         toReturn += (nonPrime + " ");
      
      return toReturn; 
    }
    
}