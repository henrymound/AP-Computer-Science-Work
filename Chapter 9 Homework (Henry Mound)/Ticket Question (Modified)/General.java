public class General extends Ticket{

  final double generalPrice = 50.00;
  
  public General(){
   
  }
  
  public double getPrice(){
    return generalPrice;
  }
  
  public abstract void bookSeats(int num);
  
}