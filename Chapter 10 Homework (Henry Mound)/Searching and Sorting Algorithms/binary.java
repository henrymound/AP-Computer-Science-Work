public class binary {
  
  public static Comparable binarySearch (Comparable[] list, Comparable target){
   
    int min=0, max=list.length-1, mid=0;  
    boolean found = false; 
    
    while (!found && min <= max) {
      mid = (min+max) / 2;    
      if (list[mid].compareTo(target) == 0)       
        found = true;    
      else           
        if (target.compareTo(list[mid]) < 0) 
        max = mid-1; else min = mid+1; 
    }
    
    if (found)      
      return mid;    
    else          
      return null; 
  }
}