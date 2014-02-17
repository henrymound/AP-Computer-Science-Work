//  Represents a street address.
public class Address    {
  
  private String streetAddress, city, state;
  private int zipCode;

  //  Constructor: Sets up this address with the specified data.
  public Address (String street, String town, String st, int zip) {
    streetAddress = street;       
    city = town;       
    state = st;       
    zipCode = zip; }

  // Returns a description of this Address object.
  public String toString() {
    String result;
    result = streetAddress + "\n";
    result += city + ", " + state + " " + zipCode;
    return result;}
  
}