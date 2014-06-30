import java.awt.*;

public class Fern extends java.applet.Applet implements Runnable
{
   FractWin  win = new FractWin();  
   final int  MAXIT = 20;  
   Thread  runner;  
   Image workspace; 
   Graphics offscreen; 
   final int  ARRAYSIZE = 300; 

   public void init()
   {
      workspace = createImage( ARRAYSIZE, ARRAYSIZE );
      offscreen = workspace.getGraphics();

      setBackground( Color.black );
      offscreen.setColor( Color.black );
      offscreen.fillRect( 0, 0, ARRAYSIZE, ARRAYSIZE );

      win.setBoundaries( (double) -5, (double) 0, (double) 5, (double) 10 );
      win.colorList[0] = Color.black;
      win.colorList[1] = Color.green;
   }  
 
 

   public void paint( Graphics screen )
   {

      if ((win.inBounds( win.lastX, win.lastY )) &
        (win.lastColor >= 0) & (win.lastColor < win.NUMCOLORS) )
      {
         offscreen.setColor( win.colorList[win.lastColor] );

         offscreen.fillRect( win.lastX, win.lastY, 1, 1 );

      }


      screen.drawImage( workspace, 0, 0, this );
   } 
 
 

   public void start()
   {
      if (runner == null)
      {
         runner = new Thread( this );
         runner.start();
      }
   }  // start()
 
 

   public void run()
   {

      while (true)
      {
         repaint(); 


         double  newx;
         double  newy;


         double x = Math.random();
         double y = Math.random();

         for (int i = 0; i < MAXIT; i++)
         {
            double  rand_num = Math.random();

            if (rand_num < 0.01)
            {
               newx = 0.0;
               newy = 0.16 * y;
               x = newx;
               y = newy;
            }  
            else
               if (rand_num < 0.86)
               {
                  newx = (0.85 * x) + (0.04 * y);
                  newy = (-0.04 * x) + (0.85 * y) + 1.6;
                  x = newx;
                  y = newy;
               }  
               else
                  if (rand_num < 0.93)
                 {
                     newx = (0.2 * x) - (0.26 * y);
                     newy = (0.23 * x) + (0.22 * y) + 1.6;
                     x = newx;
                     y = newy;
                  }  
                  else
                  {
                     newx = (-0.15 * x) + (0.28 * y);
                     newy = (0.26 * x) + (0.24 * y) + 0.44;
                     x = newx;
                     y = newy;
                  }  
         }  

         win.lastX = win.physX( x );
         win.lastY = win.physY( y );
         win.lastColor = 1;
 
      }  
   } 
 
 

   public void stop()
   {
      if (runner != null)
      {
         runner.stop();
         runner = null;
      }  
   }  
 
 

   public void update( Graphics screen )
   {
      paint( screen );
   }
}  