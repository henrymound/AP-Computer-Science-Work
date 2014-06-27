public class linear { 

  public static Comparable linearSearch (Comparable[] list, Comparable target) {
    
    int index = 0; 
    boolean found = false;  
    
    while (!found && index < list.length) {
      if (list[index].compareTo(target) == 0)    
        found = true; else index++; 
    }     
    
    if (found)   
      return index;   
    else     
      return null; 
  } 

}