public class Alumni extends General{

  double price;
  double discount = .20;
  
  public Alumni(){
    price = (super.generalPrice) - super.generalPrice*discount;
  }
  
  public double getPrice(){
    return price;
  }
  
  public String toString(){
      return super.toString()+"\n(Alumni discount 20%)"; 
  }
  
}