import java.awt.*;

public class FractWin
{
   public int arraySize = 300; 
   public int NUMCOLORS = 13; 
   public double logicalXMin; 
   public double logicalXMax; 
   public double logicalYMin; 
   public double logicalYMax;  
   public java.awt.Color[] colorList =
         new java.awt.Color[NUMCOLORS];

   public int  lastX = -1; 
   public int  lastY = -1; 
   public int  lastColor = 0; 
   public FractWin()
   {
     
   } 
 
 

   public FractWin( int ARRAYSIZE )
   {
      arraySize = ARRAYSIZE;
   } 
 
 

   public void setBoundaries( double x1, double y1, double x2, double y2 )
   {
      
      logicalXMin = x1;
      logicalXMax = x2;
      logicalYMin = y1;
      logicalYMax = y2;
   } 
 

   public boolean inBounds( int x, int y )
   {
      return ((x >= 0) & (x < arraySize) & (y >= 0) & (y < arraySize));
   }  
 
 

   public double logicalX( int px )
   {
      // Given physical x coordinate, return logical x coordinate.
      double x = ((double) px * (logicalXMax - logicalXMin) /
            (double) (arraySize)) + logicalXMin;
      return (x);
   }  // logicalX()
 
 

   public int physX( double x )
   {

      double px = arraySize * (x - logicalXMin) / (logicalXMax - logicalXMin);
      int  ipx = (int) px;

      if (inBounds( ipx, 0 ))
         return (ipx);
      else
         return (-1);
   }  
 
 

   public double logicalY( int py )
   {

      double y = ((double) py / (double) arraySize *
            (logicalYMin - logicalYMax)) + logicalYMax;
      return (y);
   }  
 
 

   public int physY( double y )
   {
  
     
      double py = (double) arraySize * ((y - logicalYMax) /
            (logicalYMin - logicalYMax));
      int  ipy = (int) py;

      if (inBounds( 0, ipy ))
         return (ipy);
      else
         return (-1);
   }  
} 