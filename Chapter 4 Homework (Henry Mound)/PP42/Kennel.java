public class Kennel{
  //Creates several dogs and displays their info
  
    public static void main (String[] args)    {       
    
    Dog dog1 = new Dog ("Lucky", 4);       
    Dog dog2 = new Dog ("Matilda", 9);       
    Dog dog3 = new Dog ("Trapper", 12);
    
    //Prints out dog info after modification
    System.out.println("Dog kennel before modification: ");
    System.out.println (dog1);
    System.out.println (dog2);       
    System.out.println (dog3);
    
    dog1.setAge(5);
    dog2.setAge(10);
    dog2.setName("Tilda");
    dog3.setAge(13);
    dog3.setName("Trapp");

    //Prints out dog info before modification
    System.out.println ("\nDog kennel after modification: \n"+dog1);
    System.out.println (dog2);       
    System.out.println (dog3);
    
  }
  
}