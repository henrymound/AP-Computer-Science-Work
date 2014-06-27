public class Class{
   
  private int period;
  private Teacher teacher;
  private String subject;
  
  public Class(){}
  
  public Class(int p, String sub, Teacher t){
     period = p;
     teacher = t;
     subject = sub;
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
  

}