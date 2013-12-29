public class Lights{

  public static void main(String[] args){
  
    //Creates five light bulbs and sets some on and off
    Bulb light1 = new Bulb(1, "on");
    Bulb light2 = new Bulb(2, "off");
    Bulb light3 = new Bulb(3, "off");
    Bulb light4 = new Bulb(4, "fff");
    Bulb light5 = new Bulb(5, "off");
    
    light1.on();
    light2.off();
    light3.on();
    light4.on();
    light5.off();
    
    //Prints out the lights status
    System.out.println(light1);
    System.out.println(light2);
    System.out.println(light3);
    System.out.println(light4);
    System.out.println(light5);
    
  }

}