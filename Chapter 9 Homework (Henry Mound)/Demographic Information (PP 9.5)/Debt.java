public class Debt extends Information{
  
  public Debt(){
    super.setInfo("Debt");
  }
  
  public String toString(){
    String toReturn = super.toString();
    toReturn += "The United States has a debt of $17.075 trillion.";
    return toReturn;
  }

}