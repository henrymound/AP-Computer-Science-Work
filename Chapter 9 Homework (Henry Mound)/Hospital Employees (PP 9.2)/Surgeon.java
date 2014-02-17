public class Surgeon extends employee{

  public Surgeon(String n){
     setName(n);
  }
    
  public String getTools(){
    return "Hello, my name is "+getName()+". I have lot's of tools, because I'm a surgeon. My favorite is a scalpel"; 
  }

}