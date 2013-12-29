public class SquarePyramid{

  //fields
  private double base;
  private double height;
  
  public SquarePyramid(double b, double h){
    base = b;
    height = h;
  }
  
  public void setBase (double b){
    base = b; 
  }
  
  public void setHeight (double h){
    height = h;
  }

  public double getSurfaceArea(){
    
    //calculates and returns the surface area of the square pyramid
    double slantHeight = (Math.sqrt(Math.pow(base/2, 2) + Math.pow(height, 2)));
    return Math.pow(base, 2) + (2 * base * slantHeight);
    
  }
  
  public double getVolume(){
    //calculates and returns the volume of the square pyramid
    return (Math.pow(base, 2) * height)/3;
  
  }
  
}