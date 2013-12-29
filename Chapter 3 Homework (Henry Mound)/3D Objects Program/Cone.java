public class Cone{

  //fields
  private double radius;
  private double height;
  
  public Cone(double r, double h){
    radius = r;
    height = h;
  }
  
  public void setHeight (double h){
    height = h; 
  }
  
  public void setRadius (double r){
    radius = r;
  }

  public double getSurfaceArea(){
    
    //calculates the slant height using the pythagorean theorem
    double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    //calculates and returns the surface area of the cone
    return (Math.PI * radius * slantHeight) + (Math.PI * Math.pow(radius, 2));
    
  }
  
  public double getVolume(){
  
    return (Math.PI * Math.pow(radius, 2) * height)/3;
  
  }
  
}