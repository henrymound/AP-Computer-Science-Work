public class cylinder{

  //fields
  private double radius;
  private double height;
  
  public cylinder(double r, double h){
    radius = r;
    height = h;
  }
  
  public void setRadius (double r){
    radius = r; 
  }
  
  public void setHeight (double h){
    height = h;
  }

  public double getSurfaceArea(){
    
    //calculates and returns the surface area of the cylinder
    return (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
      
  }
  
  public double getVolume(){
    //calculates and returns the volume of the cylinder
    return Math.PI * Math.pow(radius, 2) * height;
  
  }

}