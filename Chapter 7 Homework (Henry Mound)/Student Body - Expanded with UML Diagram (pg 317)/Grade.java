import java.text.*;

public class Grade{

  private String letterGrade;
  private double percentGrade;
  private int maxPoints;
  private int pointsEarned;
  
  public Grade(){}
  public Grade(int earned, int max){
     maxPoints = max;
     pointsEarned = earned;
     percentGrade = (double)((double)pointsEarned/(double)maxPoints)*100.0;
     letterGrade = toLetterGrade(percentGrade);
  }
  
  public String getLetterGrade(){
     return letterGrade;
  }
  public double getPercentGrade(){
     return percentGrade;
  }
  public int getMaxPoints(){
     return maxPoints;
  }
  public int getPointsEarned(){
     return pointsEarned;
  }
  public String toString(){
     return pointsEarned+"/"+maxPoints+"\t"+(new DecimalFormat("0.00").format(percentGrade))+"% - "+letterGrade+" ";
  }
  
  public static String toLetterGrade(double percent){
    if(percent <= 100 && percent >= 96)
      return "A+";
    if(percent < 96 && percent >= 93)
      return "A";
    if(percent < 93 && percent >= 90)
      return "A-";
    if(percent < 90 && percent >= 86)
      return "B+";
    if(percent < 86 && percent >= 83)
      return "B";
    if(percent < 83 && percent >= 80)
      return "B-";
    if(percent < 80 && percent >= 76)
      return "C+";
    if(percent < 76 && percent >= 73)
      return "C";
    if(percent < 73 && percent >= 70)
      return "C-";
    if(percent < 70 && percent >= 66)
      return "D+";
    if(percent < 66 && percent >= 63)
      return "D";
    if(percent < 63 && percent >= 60)
      return "D-";
    else
      return "F";
  }

}