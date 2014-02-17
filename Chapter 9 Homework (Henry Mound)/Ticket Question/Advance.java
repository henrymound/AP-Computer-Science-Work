public class Advance extends Ticket{

  protected int days;
  protected double normalPrice = 30.00;
  protected double slowPrice = 40.00;
  
  public Advance (int daysInAdvance){
    days = daysInAdvance;
  }
  
  public double getPrice(){
    if(days >= 10)
      return normalPrice;
    else return slowPrice;
  }
  
}