public class Admininstrator extends employee{

  public Admininstrator(String n){
     setName(n);
  }
  
  public String getDepartment(){
     return "My name is "+getName()+" and I am an administrator. I am head of all Hospital invintory.";
  }
  
}