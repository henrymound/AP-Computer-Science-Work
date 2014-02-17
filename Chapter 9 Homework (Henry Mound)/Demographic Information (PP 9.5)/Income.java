public class Income extends Information{
  
  public Income(){
    super.setInfo("Average income");
  }
  
  public String toString(){
    String toReturn = super.toString();
    toReturn += "The average income in the United States is $51,000.";
    return toReturn;
  }

}