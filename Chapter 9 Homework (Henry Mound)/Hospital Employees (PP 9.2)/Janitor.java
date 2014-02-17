public class Janitor extends employee{

  public Janitor(String n){
     setName(n);
  }
  
  public String getJobs(){
     return "I am a Janitor and my name is "+getName()+". I do a lot of things. My favorite is mopping the floor.";
  }

}