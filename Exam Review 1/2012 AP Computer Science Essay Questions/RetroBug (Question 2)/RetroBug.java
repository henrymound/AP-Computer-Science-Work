import info.gridworld.actor.*;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.*;
import java.awt.Color;

public class RetroBug extends Bug
{
   
  private int lastDirection;
  private Location lastLocation;
  
  public void act()
  {
    this.lastDirection = this.getDirection();
    this.lastLocation = this.getLocation();
    
    super.act();
  }
  
  public void restore()
  {
    //Only executes if there was a previous location
    if(this.lastLocation != null)
    {
      this.setDirection(this.lastDirection);
      
      Actor actorAtLast = this.getGrid().get(this.lastLocation);
      //Only moves bug if there is a flower, or a blank space
      if(actorAtLast == null || actorAtLast instanceof Flower)
        this.moveTo(this.lastLocation);
    }
  }
}
