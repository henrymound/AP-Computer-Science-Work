import java.io.*;

public class magic8{

  public magic8(int response){
    try{
      
    BufferedReader reader = new BufferedReader(new FileReader("responses.txt"));
    String line = null;
    int c = 0;
    while((line = reader.readLine()) != null){
      if(c == response){
        System.out.println(line);
        c++;
      }
       else
         c++;
    }
    }catch(Exception e){System.out.println("There was an error reading from the file");
    }
    
    
    
  }
  
}