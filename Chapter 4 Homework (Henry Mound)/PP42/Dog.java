public class Dog{

  private int age;
  private String name;
  
  //Sets the name and age
  public Dog(String n, int a){
    age = a;
    name = n;
  }
  
  //Sets the name
  public void setName(String n){
    name = n;
  }
  
  //Sets the age
  public void setAge(int a){
    age = a;
  }

  //returns the name
  public String getName(){
    return name;
  }
  
  //returns the age
  public int getAge(){
    return age;
  }
  
  //returns age in human years
  public int getHumanAge(){
    return age * 7;
  }
  
  public String toString(){
    return "Name: "+name+"\t"+"Age: "+age+" ("+getHumanAge()+" in human years)";
  }
  
}