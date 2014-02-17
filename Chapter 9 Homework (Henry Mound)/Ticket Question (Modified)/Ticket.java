import java.util.Random;

public abstract class Ticket {

  private int serialNumber;
  private static int[][] theaterSeats = new int[10][5];
  
  // unique ticket id number   
  public Ticket() {
    serialNumber = getNextSerialNumber(); 
  }
  
  // returns the price for this ticket
  public abstract double getPrice();
  public abstract void bookSeats(int num);
  
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