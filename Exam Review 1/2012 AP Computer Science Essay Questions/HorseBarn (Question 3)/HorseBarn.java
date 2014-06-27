public class HorseBarn{

  //creates some test horses (for demonstration purposes)
  private Horse[] spaces = {
     null,
     null,
     new Horse("Allie", 72),
     new Horse("Jerry", 123),
     new Horse("Steve", 500),
     null,
     null,
     new Horse("Waldo", 150)
  };
  
  public int findHorseSpace(String name){
    int location = -1;
    for(int x = 0; x < spaces.length; x++){
      if(spaces[x] != null && (spaces[x].getName().equals(name)) ){
        location = x;
        break;
      }
    }
    return location;
  }
  
  public void consolidate(){
    Horse[] spaces2 = new Horse[spaces.length];
    int counter = 0;
    
    for(int x = 0; x < spaces.length; x++){
      if(spaces[x] != null){
        spaces2[counter] = spaces[x];
        counter++;
      }
    }
    spaces = spaces2;
  }

}

