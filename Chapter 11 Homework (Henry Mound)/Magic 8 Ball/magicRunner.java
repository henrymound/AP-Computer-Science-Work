import java.util.Random;

public class magicRunner{

  public static void main(String[] args){
    Random rand = new Random();
    magic8 ball = new magic8(rand.nextInt(19));

  }

}