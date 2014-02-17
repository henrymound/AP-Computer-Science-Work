public class Capital extends Information{
  
  public Capital(){
    super.setInfo("Capital:");
  }
  
  public String toString(){
    String toReturn = super.toString();
    toReturn += "The U.S. capital is Washington D.C.";
    return toReturn;
  }

}