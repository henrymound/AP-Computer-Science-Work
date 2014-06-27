public class Horse{

  private String name;
  private int weight;
  
  public Horse(){
     name = "";
     weight = 0;
  }
  
  public Horse(String name, int weight){
     this.name = name;
     this.weight = weight;
  }
  
  public void setName(String n){
     name = n;
  }
  
  public void setWeight(int w){
     weight = w;
  }
  
  String getName(){
     return name;
  }
  
  int getWeight(){
     return weight;
  }

}