import java.awt.*;
import javax.swing.*;


public class TreeTurtle extends Turtle{

  public static void main(String[] args){
     TreeTurtle t = new TreeTurtle();
     t.setPenDown(false);
     t.moveTo(350, 740);
     t.setPenDown(true);
     t.tree(14, 200);
  }
  
  public void tree(int depth, double trunksize){
    if (depth == 1){
      forward(trunksize);
    }else{
      forward(trucksize);
      turn(45);
      tree(depth - 1, trunksize * .6);
      turn(-90);
      tree(depth - 1, trunksize * .6);
      turn(45);
    }
    backward(trunksize);
  }
   

}