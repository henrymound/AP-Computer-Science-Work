import java.util.*;

public class StudentBody{

  public static void main (String[] args){
     
      Address school = new Address ("800 Lancaster Ave.", "Villanova","PA", 19085);
      
      //Creates a student named John
      Address jHome = new Address ("21 Jump Street", "Lynchburg", "VA", 24551);
      Student john = new Student ("John", "Smith", jHome, school);
      
      //Creates some teachers
      Address mHome = new Address ("123 Main Street", "Euclid", "OH", 44132);
      Teacher marsha = new Teacher ("Marsha", "Jones", mHome, school);
      Address sHome = new Address ("842 Pickle Av", "Greentown", "WA", 74821);
      Teacher sean = new Teacher ("Sean", "Goodman", mHome, school);
      Address wHome = new Address ("42 Wallaby Way", "Sidney", "CA", 54617);
      Teacher will = new Teacher ("Will", "Ferrell", mHome, school);
      Address hHome = new Address ("7 Clam Street", "Seatown", "MA", 38592);
      Teacher harrison = new Teacher ("Harrison", "Von-Dwingilo", mHome, school);
      Address fHome = new Address ("43 Robot Blvd", "Automatron", "PA", 23819);
      Teacher friso = new Teacher ("Friso", "Hermans", mHome, school);
      Address pHome = new Address ("Imagine Street", "Yellowville", "CA", 54617);
      Teacher paul = new Teacher ("Paul", "McCartney", mHome, school);
      
      //Creates johns schedule, and prints it out
      StudentSchedule jSchedule = new StudentSchedule(john);
      jSchedule.setPeriod(1, new Class(1, "Science", marsha));
      jSchedule.setPeriod(2, new Class(2, "Chorus", paul));
      jSchedule.setPeriod(3, new Class(3, "Math", friso));
      jSchedule.setPeriod(4, new Class(4, "English", harrison));
      jSchedule.setPeriod(5, new Class(5, "Acting", will));
      jSchedule.setPeriod(6, new Class(6, "Government", sean));
      System.out.println(john + "\n");
      jSchedule.printSchedule();
      john.setSchedule(jSchedule);
      
      //Checking who the teacher is for a particular class
      Random r = new Random();
      int period = r.nextInt(6)+1;
      System.out.println("\nTeacher for Period "+ period+": "+john.getSchedule().getTeacher(period).getName()+"\n");
      
      //Look up information on a teacher, and a student
      System.out.println(will.getAddress().toString()+"\n");
      System.out.println(john.getAddress().toString()+"\n");
      
      //Check grades of a student in their class
      StudentGrades jGrades = new StudentGrades();
      jGrades.addGrades(14, 18, john.getSchedule().getPeriod(1));//adding a grade to Johns period 1 class
      jGrades.addGrades(28, 30, john.getSchedule().getPeriod(1));//John recieved a 14/18 and a 28/30
      jGrades.addGrades(41, 45, john.getSchedule().getPeriod(3));//Adds grades to Johns 3rd period class
      jGrades.addGrades(3, 5, john.getSchedule().getPeriod(3));
      jGrades.addGrades(2, 2, john.getSchedule().getPeriod(3));
      jGrades.addGrades(98, 100, john.getSchedule().getPeriod(3));
      jGrades.addGrades(40, 50, john.getSchedule().getPeriod(3));
      jGrades.printGrades(1);//Prints out all grades for the period 1 class, and the total grade
      System.out.println();
      jGrades.printGrades(3);//Prints out all grades for the period 3 class, and the total grade
      
      //UPDATES FOR CHAPTER 8
      Class science = new Class(4, "Science", new Teacher("Thomas", "Cooper", mHome, school));
      science.addStudent(new Student("John", "Doe"));
      science.addStudent(new Student("Willfred", "Jenkins"));
      science.addStudent(new Student("Henry", "Mound"));
      
      System.out.println("\n------------------------------------ UPDATES FOR CHAPTER 8 ------------------------------------");
      science.setMaxStudents(30);
      System.out.println("Setting the class maximum to less than the number of students enrolled...");
      science.setMaxStudents(2);
      System.out.println("Adding a child to a full class...");
      Student delroy = new Student("Delroy", "Murray");
      science.addStudent(delroy);
      
      System.out.println("\n\nMaking some grades");
      StudentSchedule dSchedule = new StudentSchedule(delroy);
      delroy.setSchedule(dSchedule);
      dSchedule.setPeriod(1, new Class(1, "Computer Science", paul));
      dSchedule.setPeriod(2, new Class(2, "Astronomy", friso));
      //Adding grades to Delroy's gradebook.
      StudentGrades dGrades = new StudentGrades();
      dGrades.addGrades(15, 18, delroy.getSchedule().getPeriod(1));
      dGrades.addGrades(22, 30, delroy.getSchedule().getPeriod(1));
      dGrades.addGrades(45, 45, delroy.getSchedule().getPeriod(1));
      dGrades.addGrades(4, 5, delroy.getSchedule().getPeriod(2));
      dGrades.addGrades(8, 10, delroy.getSchedule().getPeriod(2));
      dGrades.addGrades(77, 100, delroy.getSchedule().getPeriod(2));
      dGrades.addGrades(30, 50, delroy.getSchedule().getPeriod(2));
      dGrades.printGrades(1);//Prints out all grades for the period 1 class, and the total grade
      System.out.println();
      dGrades.printGrades(2);//Prints out all grades for the period 2 class, and the total grade
      System.out.println("\n\nCalculating GPA...");
      dGrades.calculateGPA();
      System.out.println("\nDropping lowest grade...");
      dGrades.dropLowest();
      System.out.println("\nRe-calculating GPA after lowest grade drop...");
      dGrades.calculateGPA();
      

      
  }
}
