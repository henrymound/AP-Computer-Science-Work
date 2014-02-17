import java.util.ArrayList;

   public class Maroon5 {
     
     //  Stores and modifies a list of band members.
      
     public static void main (String[] args)    {
         
       ArrayList<String> band = new ArrayList<String>();
       band.add ("Adam Levine"); 
       band.add ("Jesse Carmichael");
       band.add ("Mickey Madden");
       band.add ("James Valentine");
       band.add ("Matt Flynn");
       
       System.out.println (band);
       int location = band.indexOf ("Jesse Carmichael");
       band.remove (location);
       
       System.out.println (band);
       System.out.println ("At index 1: " + band.get(1));
       
       band.add (2, "Ringo");
       
       System.out.println ("Size of the band: " + band.size() + "\n");
       
       int index = 0;
       while (index < band.size())       {
         System.out.println (band.get(index));
         index++; 
       } 
       
     } 
     
   }
   
/*
 "Maroon 5," is a popular 21st-century band. Adam Levine is the most well known band member, and he is the lead singer.
 James Valentine plays the guitar, Jesse Carmichael plays keyboard, Micked Madden plays Bass guitar, and Ryan Dusick plays the drums.
*/