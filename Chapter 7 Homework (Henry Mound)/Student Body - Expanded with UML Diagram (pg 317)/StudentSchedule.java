import java.util.*;

public class StudentSchedule{

  ArrayList<Class> classList = new ArrayList<Class>(6);
  
  public StudentSchedule(){
    //Populates schedule with 6 empty classes
    classList.add(new Class());
    classList.add(new Class());
    classList.add(new Class());
    classList.add(new Class());
    classList.add(new Class());
    classList.add(new Class());
  }
  
  //Replaces classes at the periods index
  public void setPeriod(int period, Class c){
     classList.set(period-1, c);
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