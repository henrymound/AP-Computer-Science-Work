public class LifeExpectancy extends Information{
  
  public LifeExpectancy(){
    super.setInfo("Life expectancy");
  }
  
  public String toString(){
    String toReturn = super.toString();
    toReturn += "The average life expectency in the United States is 78.64 years.";
    return toReturn;
  }

}