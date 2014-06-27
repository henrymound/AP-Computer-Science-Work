//Represents a college student.
public class Student {
  
  private String firstName, lastName;
  private Address homeAddress, schoolAddress;
  private StudentSchedule schedule;
  private StudentGrades grades;

  //  Constructor: Sets up this student with the specified values. 
  public Student (String first, String last, Address home, Address school){
    firstName = first;
    lastName = last;
    homeAddress = home;
    schoolAddress = school; }       

  //  Returns a string description of this Student object.
  public String toString(){
    String result;
    result = firstName + " " + lastName + "\n";
    result += "Home Address:\n" + homeAddress + "\n";
    result += "School Address:\n" + schoolAddress;
    return result;
  }
  
  public void setSchedule(StudentSchedule ss){
     schedule = ss;
  }
  public StudentSchedule getSchedule(){
     return schedule;
  }
  
  public String getName(){
     return firstName + " " + lastName;
  }

  public Address getAddress(){
    return homeAddress;
  }
  
  public void addGrades(StudentGrades sg){
     grades = sg;
  }
  
}
