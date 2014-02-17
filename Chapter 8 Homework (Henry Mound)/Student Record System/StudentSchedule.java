import java.util.*;

public class StudentSchedule{

  ArrayList<Class> classList = new ArrayList<Class>(6);
  private Student student;
  
  public StudentSchedule(Student s){
    //Populates schedule with 6 empty classes
    classList.add(new Class());
    classList.add(new Class());
    classList.add(new Class());
    classList.add(new Class());
    classList.add(new Class());
    classList.add(new Class());
    student = s;
  }
  
  //Replaces classes at the periods index
  public void setPeriod(int period, Class c){
     classList.set(period-1, c);
     c.addStudent(student);
  }
  
  public Class getPeriod(int period){
     return classList.get(period-1);
  }
  
  public Teacher getTeacher(int period){
     return classList.get(period - 1).getTeacher();
  }
  
  public void printSchedule(){
      for(int i = 0; i < 6; i++)
         System.out.println(classList.get(i).toString());
    
  }

}