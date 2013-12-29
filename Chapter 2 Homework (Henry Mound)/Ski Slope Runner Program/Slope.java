public class Slope{

  //fields
  private int x1, x2, y1, y2;
  private double slope;
  
  //constructers
  public Slope (int x1, int x2, int y1, int y2){
    
    //sets the variables
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;

  }
  
  public double calculateSlope(){
  
    slope =  Math.abs((this.y2-this.y1) / (double)(this.x2-this.x1) );
    slope = Math.round(slope*100);
    return slope;
    
  }
  
  public String toString(){
  
    return "The slope is :" + Double.toString(slope);
    
  }
  
  public String slopeRating(){
  
    String rating = "";
    
    if(slope < 6)
      rating = "not steep enough for skiing";
      
    if(slope >= 6 && slope < 25)
      rating = "a green circle";
    
    if(slope >= 25 && slope < 40)
      rating = "a blue square";
 
    if(slope >= 40 && slope < 90)
      rating = "a black diamond";
    
    else if(slope >= 90)
      rating = "a cliff face";
      
    return rating;
  
  }

}