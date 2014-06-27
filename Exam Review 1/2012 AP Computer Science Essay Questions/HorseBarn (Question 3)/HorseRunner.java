public class HorseRunner{

  public static void main(String[] args){
    HorseBarn barn = new HorseBarn();
    System.out.println(barn.findHorseSpace("Jerry"));
    barn.consolidate();
    System.out.println(barn.findHorseSpace("Jerry"));
  }

}