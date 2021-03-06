public class CoastlineTurtle extends Turtle{
  
  public void curve(int depth, double size){
    if(depth == 0){
       forward(size);
    }else{
      curve(depth - 1, size / 3);
      turn(-60);
      curve(depth - 1, size / 3);
      turn(120);
      curve(depth - 1, size / 3);
      turn(-60);
      curve(depth - 1, size / 3);
    }
  }
  
  public static void main (String[] args){
     CoastlineTurtle t = new CoastlineTurtle();
     t.penUp();
     t.moveTo(50, 350);
     t.penDown();
     t.setHeading(90);
     t.curve(6, 600);
     t.hide();
  }
}