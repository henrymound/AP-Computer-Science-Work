public class Unemployment extends Information{
  
  public Unemployment(){
    super.setInfo("Unemployment rate");
  }
  
  public String toString(){
    String toReturn = super.toString();
    toReturn += "The U.S. unemployment rate is 7.3%.";
    return toReturn;
  }

}