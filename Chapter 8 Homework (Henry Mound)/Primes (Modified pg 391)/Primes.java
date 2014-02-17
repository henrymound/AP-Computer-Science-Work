public class Primes{
   
    private int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19};
    
    public String toString(){
      String toReturn = "";
      toReturn += "The prime number array is " + primeNums.length + " numbers long.\n";
      toReturn += "The first few primes are: ";
       
      for (int prime : primeNums)
         toReturn += (prime + " ");
      
      return toReturn; 
    }
    

}