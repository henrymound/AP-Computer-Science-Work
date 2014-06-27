import java.util.*;

public class ClimbingClub    {
    
  private List<ClimbInfo> climbList;

  public ClimbingClub() {
    climbList = new ArrayList<ClimbInfo>(); 
  }

  public void addClimb(String peakName, int climbTime) {
     //Part A
     //this.climbList.add(new ClimbInfo(peakName, climbTime));
     //Part B
    
     for(int x = 0; x < this.climbList.size(); x++){
       if(!(peakName.compareTo(this.climbList.get(x).getName())>0)){
         this.climbList.add(x-1, new ClimbInfo(peakName, climbTime));
         break;
      }
    }
    
  }

//  public int distinctPeakNames() {
    
//  }

}