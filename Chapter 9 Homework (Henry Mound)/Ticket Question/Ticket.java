import java.util.Random;

public abstract class Ticket {

  private int serialNumber;
  
  // unique ticket id number   
  public Ticket() {
    serialNumber = getNextSerialNumber(); 
  }
  
  // returns the price for this ticket
  public abstract double getPrice();
  
  // returns a string with information about the ticket
  public String toString() {
    return "Number: " + serialNumber + "\nPrice: " + getPrice(); 
  }
  // returns a new unique serial number
  private static int getNextSerialNumber() {
    Random r = new Random();
    int rand = r.nextInt(100000000);
    return rand;
  } 
} 