public class Population extends Information{
  
  public Population(){
    super.setInfo("Population");
  }
  
  public String toString(){
    String toReturn = super.toString();
    toReturn += "The population of the United States is 313.9 million people.";
    return toReturn;
  }

}