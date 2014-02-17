public class Palindrome{

  boolean isPal = false;
  
  public Palindrome(String str){
  
   int left = 0;
   int right = str.length() - 1;
      
    while (str.charAt(left) == str.charAt(right) && left < right){
        left++;
        right--;
      }

      if (left < right)
        isPal = false;
      else
        isPal = true;
      
  }
  
  public boolean isTrue(){
  
    return isPal;
  
  }


}