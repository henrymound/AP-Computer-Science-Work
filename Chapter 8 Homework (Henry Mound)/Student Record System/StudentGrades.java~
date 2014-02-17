import java.util.*;
import java.text.*;

public class StudentGrades implements ViewGrades{
  
  ArrayList<Grade> gradeList = new ArrayList<Grade>();
  ArrayList<Class> classList = new ArrayList<Class>();
  
  public StudentGrades(){}
  
  public void printGrades(int period){
    int totalRecieved = 0;
    int totalMax = 0;
    //Gets all grade from the periood, and the final grade
    for(int i = 0; i < gradeList.size(); i++){
      if (classList.get(i).getPeriod() == period){
        System.out.println(classList.get(i));
        System.out.print(gradeList.get(i)+"\t");
        totalRecieved += gradeList.get(i).getPointsEarned();
        totalMax += gradeList.get(i).getMaxPoints();
      }
    }
    if(totalMax != 0){//Only prints out final grade if there are grades in the bookC
      System.out.println("----------------------------------------------------------------");
      System.out.println(totalRecieved+"/"+totalMax+"\t"+(new DecimalFormat("0.00").format(((double)(totalRecieved)/(double)(totalMax)*100))) + "% - "+
                         Grade.toLetterGrade(((double)(totalRecieved)/(double)(totalMax)*100)) +"\tFINAL GRADE");}
  }
  
  public String getGrades(){
    String toReturn = "";
    for(int i = 0; i < gradeList.size(); i++){
      toReturn += gradeList.get(i)+"";
      toReturn += classList.get(i)+"\n";
    }
    return toReturn;
  }
  
  public void addGrades(int earned, int max, Class c){
    gradeList.add(new Grade(earned, max));
    classList.add(c);
  }

  
}
