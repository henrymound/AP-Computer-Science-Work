import java.text.*;

public class item{
    
    DecimalFormat df = new DecimalFormat("#.##");  
    
    private String category;
    private String name;
    private double price;
    

    public item(){
        name = "";
        price = 0.0;
    }
        
    public item(String Category, String Name, double Price){
        category    = Category;
        name        = Name;
        price       = Price;
    }
    
    //getters
    
    public String getName(){
      return name;}
   
    public String getCategory(){
      return category;}
    
    public double getPrice(){
      return price;}
    
    //setters
    
    public void setName(String n){
      name = n;}
   
    public void setCategory(String c){
      category = c;}
    
    public void setPrice(double p){
      price = p;}
    
    //formatter
    public String toString(){
      return String.format("%s: %s\t\t$%s", category, name, price);}
    

}