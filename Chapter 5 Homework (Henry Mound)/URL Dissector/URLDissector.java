import java.util.Scanner; 
import java.io.*;

public class URLDissector {
  public static void main (String[] args) throws IOException{
    
    String url;       
    Scanner fileScan, urlScan;
    
    fileScan = new Scanner (new File("urls.txt"));
    
    //  Read and process each line of the file
    while (fileScan.hasNext())       {
      url = fileScan.nextLine();
      
      System.out.println ("URL: " + url);
      
      urlScan = new Scanner (url);
      urlScan.useDelimiter("/");
      
      //  Print each part of the url          
      
      while (urlScan.hasNext())             
        System.out.println ("  " + urlScan.next());          
      
      System.out.println();
      
    }
  }  
}