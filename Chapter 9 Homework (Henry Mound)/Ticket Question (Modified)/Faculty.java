public class Faculty extends Ticket{
  
  double price;
  
  public Faculty(){
    price = 20.00; 
  }
  
  public double getPrice(){
    return price;
  }
  
  public String toString(){
      return super.toString()+"\n(Administrator ID required)"; 
  }

}