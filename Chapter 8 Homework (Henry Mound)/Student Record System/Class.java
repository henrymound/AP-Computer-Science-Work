import java.util.ArrayList;

public class Class{
   
  private int period;
  private Teacher teacher;
  private String subject;
  private int maxStudents;
  private int studentsEnrolled;
  private ArrayList<Student> studentList = new ArrayList<Student>();
  
  public Class(){
     maxStudents = 22; //22 is the defauly max students
     studentsEnrolled = 0;
  }
  
  public Class(int p, String sub, Teacher t){
     period = p;
     teacher = t;
     subject = sub;
     maxStudents = 22; //22 is the defauly max students
  }
  
  public String toString(){
     return String.format("Period: %s\t%s\t\t%s", period, subject, teacher.getName());
  }
  
  public int getPeriod(){
     return period;
  }
  public String getSubject(){
     return subject;
  }
  public Teacher getTeacher(){
     return teacher;
  }
  public void setMaxStudents(int max){
     maxStudents = max;
     System.out.println("Maximum class size set to "+ max + " students");
     
     if(studentsEnrolled > max){//Kicks kids out if there are to many students
       System.out.println("There are currently "+studentsEnrolled+"/"+maxStudents+" students in this class."+
                            "\nWe will have to kick "+(studentsEnrolled-maxStudents)+" out of the class!");
       studentsEnrolled = maxStudents;
     }
  }
  public void addStudent(Student s){
    studentList.add(s);
    if(studentsEnrolled < maxStudents){//Adds a student if there is room in the class.
      studentsEnrolled++; 
      System.out.println("There are currently " +studentsEnrolled+"/"+maxStudents+" enrolled in the class");}
    else{
      System.out.println("Could not add student, this class is full. - "+studentsEnrolled+"/"+maxStudents);
    }
  }

}