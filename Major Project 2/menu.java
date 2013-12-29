import java.util.ArrayList;
import java.text.*;
import java.util.Scanner;
import java.util.Random;

public class menu{
  
    private ArrayList<item> menuArray = new ArrayList<item>();
    private ArrayList<item> cartArray = new ArrayList<item>();
    DecimalFormat df = new DecimalFormat("#.##");  
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
            
    private final double TAX_RATE = 0.06;
    public double total = 0.0;
    
    //constructer
    public menu(){
    
      menuArray.add(new item("Appetizer", "Garlic Bread Parmesan     ", 4.25));    
      menuArray.add(new item("Appetizer", "Meatballs & Marinara Sauce", 4.95));    
      menuArray.add(new item("Appetizer", "Homemade Mozzarella Sticks", 6.95));    
      menuArray.add(new item("Appetizer", "Sampler Platter           ", 8.95));    
      menuArray.add(new item("Appetizer", "Jalapeño Poppers          ", 8.95));    
      menuArray.add(new item("Appetizer", "Fried Zucchini Sticks     ", 6.95));
      
      menuArray.add(new item("Wings", "Boneless Wings (10 pcs)   ", 7.95));         
      menuArray.add(new item("Wings", "Boneless Wings (20 pcs)   ", 14.95));         
      menuArray.add(new item("Wings", "Boneless Wings (30 pcs)   ", 21.95));           
      menuArray.add(new item("Wings", "Buffalo Wings (8 pcs)     ", 7.95));           
      menuArray.add(new item("Wings", "Buffalo Wings (16 pcs)    ", 14.95));           
      menuArray.add(new item("Wings", "Buffalo Wings (24 pcs)    ", 21.95));      
      
      menuArray.add(new item("Soups & Salads", "Chicked Soup       ", 4.50));            
      menuArray.add(new item("Soups & Salads", "Chicken Caesar (S) ", 6.95));                
      menuArray.add(new item("Soups & Salads", "Chicken Caesar (L) ", 9.95));            
      menuArray.add(new item("Soups & Salads", "Grilled Chicken (S)", 6.95));                
      menuArray.add(new item("Soups & Salads", "Grilled Chicken (L)", 9.95));            
      menuArray.add(new item("Soups & Salads", "Spinich Salad   (S)", 7.95));                
      menuArray.add(new item("Soups & Salads", "Spinich Salad   (L)", 10.95));                  
      
      menuArray.add(new item("Pizza", "Famous Special (10\")", 9.95)); 
      menuArray.add(new item("Pizza", "Famous Special (14\")", 14.95)); 
      menuArray.add(new item("Pizza", "Famous Special (18\")", 18.75));       
      menuArray.add(new item("Pizza", "Primavera (10\")     ", 9.95)); 
      menuArray.add(new item("Pizza", "Primavera (14\")     ", 14.95)); 
      menuArray.add(new item("Pizza", "Primavera (18\")     ", 18.75));       
      menuArray.add(new item("Pizza", "Talia’s Chicken(10\")", 9.95)); 
      menuArray.add(new item("Pizza", "Talia’s Chicken(14\")", 14.95)); 
      menuArray.add(new item("Pizza", "Talia’s Chicken(18\")", 18.75));        
      menuArray.add(new item("Pizza", "Buffalo Chicken(10\")", 9.95)); 
      menuArray.add(new item("Pizza", "Buffalo Chicken(14\")", 14.95)); 
      menuArray.add(new item("Pizza", "Buffalo Chicken(18\")", 18.75));  
                
      menuArray.add(new item("Calzones", "Cheese             ", 6.95));                     
      menuArray.add(new item("Calzones", "Meat Lovers        ", 9.45));                     
      menuArray.add(new item("Calzones", "Veggie Lovers      ", 9.45));                     
      menuArray.add(new item("Calzones", "Buffalo Chicken    ", 8.45));                     
      menuArray.add(new item("Calzones", "Chicken Parm       ", 7.95));     
   
    }
    
    //Displays all of one category
    public void displayCategory(String c){
      for(int x = 0; x < menuArray.size(); x++)
        if(menuArray.get(x).getCategory().equals(c))
           System.out.println((x+1)+". "+menuArray.get(x).toString());
    }
    
    //Adds items to a cart array
    public void addToCart(int itemNum){
       cartArray.add(menuArray.get(itemNum-1));}
    
    //Displays the current cart
    public void displayCart(){
      for(int x = 0; x < cartArray.size(); x++)
           System.out.println((x+1)+". "+cartArray.get(x).toString());
      if(cartArray.size() == 0)
         System.out.println("No items in cart!");
    }
    
    //Checks out all items in cart, returns receipt
    public String toString(){
      String toReturn = "";
      
       if(cartArray.size() != 0){
       toReturn+="************************ RECEIPT ************************\n";
       for(int x = 0; x < cartArray.size(); x++)
           toReturn += cartArray.get(x).toString()+"\n";
       for(int x = 0; x < cartArray.size(); x++)
           total += cartArray.get(x).getPrice();
       toReturn += "Tax:\t\t\t\t\t\t$"+df.format(total*TAX_RATE) + "\n\nTotal:\t\t\t\t\t\t$"+df.format((total*TAX_RATE+(total)))+"\n";
       toReturn += "Server: Henry Mound\t\tOrder Number: "+rand.nextInt(10000000)+"\n";}
       
       return toReturn;}
       
      
    
    //Gets payment from customer
    public void pay(double m){
      
      boolean stillPaying = true;
      while(stillPaying){
        
      if(m >= (total*TAX_RATE+(total))){
      System.out.println("Your Change is:\t\t\t\t$"+df.format(m - ((total*TAX_RATE+(total))) ));
      System.out.println("Thanks for shopping with us!");
      stillPaying = false;}
      else{
        System.out.println("That's not enough money! Try again...");
        System.out.println("Enter how much you will pay: ");
        m = scan.nextDouble();}

      }
    
    }

}