public class Doctor extends employee{

  public Doctor(String n){
     setName(n);
  }
  
  public String getPatients(){
     return "My name is "+getName()+". I have lot's of patients, because I'm a doctor!";
  }

}