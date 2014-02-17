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
  
  public void dropLowest(){
    
    double lowest = 100;
    int location = 0;
    for(int i = 0; i < gradeList.size(); i++){
        double x = (((double)(gradeList.get(i).getPointsEarned()))/((double)(gradeList.get(i).getMaxPoints())))*100;
        if(x < lowest){
          lowest = x;
          location = i;
        }
    }
    System.out.println("Dropped lowest grade - "+lowest+"%");
    gradeList.remove(location);
  }
  
  public void calculateGPA(){
      int points = 0;
      int total = 0;
      double avg = 0;
      for(int i = 0; i < gradeList.size(); i++){
        points += gradeList.get(i).getPointsEarned();
        total += gradeList.get(i).getMaxPoints();
      }

      avg = (((double)(points)/(double)(total)*100));
      System.out.println("GPA Average - " + gradeToGPA(avg));


  }
  
  public double gradeToGPA(double percent){
    if(percent <= 100 && percent >= 93)
      return 4.0;
    if(percent < 93 && percent >= 90)
      return 3.7;
    if(percent < 90 && percent >= 86)
      return 3.3;
    if(percent < 86 && percent >= 83)
      return 3.0;
    if(percent < 83 && percent >= 80)
      return 2.7;
    if(percent < 80 && percent >= 76)
      return 2.3;
    if(percent < 76 && percent >= 73)
      return 2.0;
    if(percent < 73 && percent >= 70)
      return 1.7;
    if(percent < 70 && percent >= 66)
      return 1.3;
    if(percent < 66 && percent >= 63)
      return 1.0;
    if(percent < 63 && percent >= 60)
      return 0.0;
    else
      return 0.0;
  }

  
}
