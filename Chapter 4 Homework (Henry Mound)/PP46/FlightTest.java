public class FlightTest{
  //Creates several dogs and displays their info
  
    public static void main (String[] args)    {       
    
    Flight flight1 = new Flight (7382, "American Airlines", "New York", "San Francisco");       
    Flight flight2 = new Flight (4637, "Virgin Airlines", "London", "Paris");       
    Flight flight3 = new Flight (1829, "Delta Airlines", "Los Angeles", "San Diego");
    
    //Prints out the flight details before modification
    System.out.println("Airport before modification: ");
    System.out.println (flight1);
    System.out.println (flight2);       
    System.out.println (flight3);
    
    //Modifies flights
    flight1.setFlightOrigin("Newark");
    flight1.setFlightDestination("San Diego");
    flight1.setFlightNumber(7383);
    
    flight2.setFlightDestination("Milan");
    flight2.setFlightNumber(4638);
    
    flight3.setFlightNumber(1830);
    flight3.setFlightDestination("San Francisco");
        
    //Prints out the flight details after modification
    System.out.println ("\nAirport after modification: \n"+flight1);
    System.out.println (flight2);       
    System.out.println (flight3);
    
  }
  
}