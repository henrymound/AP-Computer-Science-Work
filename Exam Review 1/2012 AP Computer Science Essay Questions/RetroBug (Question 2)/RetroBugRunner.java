import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;


public class RetroBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        RetroBug alice = new RetroBug();
        
        alice.setColor(Color.ORANGE);
        world.add(new Location(7, 8), alice);
        world.show();
        
        alice.act();
        alice.restore();
    }
}