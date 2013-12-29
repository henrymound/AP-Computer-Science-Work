public class Flight{

  private int flightNumber;
  private String flightName;
  private String flightOrigin;
  private String flightDestination;
  
  //Sets the name and age
  public Flight(int number, String name, String origin, String destination){
    flightNumber = number;
    flightName = name;
    flightOrigin = origin;
    flightDestination = destination;
  }
  
  //Sets the name
  public void setFlightName(String name){
    flightName = name;
  }
  
  //Sets the flight number
  public void setFlightNumber(int number){
    flightNumber = number;
  }
  
  //Sets the flight origin
  public void setFlightOrigin(String origin){
    flightOrigin = origin;
  }
  
  //Sets the flight destination
  public void setFlightDestination(String destination){
    flightDestination = destination;
  }

  //returns the name
  public String getFlightName(){
    return flightName;
  }
  
  //returns the flight number
  public int getFlightNumber(){
    return flightNumber;
  }
  
  //returns the flight origin
  public String getFlightOrigin(){
    return flightOrigin;
  }
  
  //returns the flight destination
  public String getFlightDestination(){
    return flightDestination;
  }
  public String toString(){
    return flightNumber+"\t"+flightName+"\tFrom: "+flightOrigin+"\tTo: "+flightDestination;
  }
  
}