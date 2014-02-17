public class Teacher{
  
  private String firstName, lastName;
  private Address homeAddress, schoolAddress;

  //  Constructor: Sets up this teacher with the specified values. 
  public Teacher (String first, String last, Address home, Address school){
    firstName = first;
    lastName = last;
    homeAddress = home;
    schoolAddress = school; }       

  //  Returns a string description of this Teacher object.
  public String toString(){
    String result;
    result = firstName + " " + lastName + "\n";
    result += "Home Address:\n" + homeAddress + "\n";
    result += "School Address:\n" + schoolAddress;
    return result;
  }
  
  public String getName(){
     return firstName + " " + lastName;
  }

  public Address getAddress(){
    return homeAddress;
  }
}