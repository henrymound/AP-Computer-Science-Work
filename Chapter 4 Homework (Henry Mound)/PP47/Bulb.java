public class Bulb{

  private boolean isOn;
  private int num;
  
  //creates the light bulb with a number and status
  public Bulb(int num, String onOrOff){
    
    if(onOrOff.equals("on")) isOn = true;
    if(onOrOff.equals("off")) isOn = false;
    
    this.num = num;
    
  }
  
  //returns if the bulb is on
  public boolean isOn(){
    return isOn;
  }
  
  //sets the current state of the bulb
  public void on(){
    isOn = true;
  }
  
  public void off(){
    isOn = false;
  }
  
  //returns the bulb number and its status
  public String toString(){
    if (isOn){ return "Light "+num+": On";}
    else { return "Light "+num+": Off";}
  }
}