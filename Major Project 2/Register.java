import java.util.Scanner;
import java.util.*;

public class Register{
  
  Scanner scan;
  String action;
  menu Menu = new menu();
  
  public Register(){
    scan = new Scanner(System.in);
    action = "";
  }
  
  public void getAction(){
    
    System.out.println("\nEnter what you would like to do! [View Menu (m)] [Order Item (o)] [View Items in Cart (v)] [Proceed to Checkout (c)] [Exit e]");
    
    while(!action.equals("e")){
       action = scan.nextLine().toLowerCase();
       processAction(action);}}

 public void processAction(String a){
    
  if(a.equals("m"))
    displayMenu();
  if(a.equals("v"))
    Menu.displayCart();
  if(a.equals("o")){
    System.out.println("Enter the number of the item you want to order! [View Menu (m)]");
    String d = scan.nextLine();
    if(d.toLowerCase().equals("m"))
      displayMenu();
    else{
      Menu.addToCart(Integer.parseInt(d));}
  }
  if(a.equals("c")){
     System.out.println(Menu.toString());
     System.out.println("Enter how much you will pay: ");
     double pay = scan.nextDouble();
     Menu.pay(pay);
     scan.nextLine();
  }
  if(!a.equals("e"))
     getAction();
  
 
}

 public void displayMenu(){
   
  System.out.println("What would you like to display? [Appetizers (a)], [Wings (w)], [Soups & Salads (s)], [Pizza (p)], [Calzones (c)], [Whole Menu (m)], [Return to Main Menu (e)]");
  Scanner scan = new Scanner(System.in);
  boolean whole = false;
  String entry = scan.nextLine().toLowerCase();
  
  if(entry.equals("m"))whole = true;
  if(entry.equals("a")||whole){
    System.out.println("********************** APPETIZERS **********************");
    Menu.displayCategory("Appetizer");}
  if(entry.equals("w")||whole){
    System.out.println("************************ WINGS ************************");
    Menu.displayCategory("Wings");}
  if(entry.equals("s")||whole){
    System.out.println("******************** SOUPS & SALADS ********************");
    Menu.displayCategory("Soups & Salads");}
  if(entry.equals("p")||whole){
    System.out.println("************************ PIZZAS ************************");
    Menu.displayCategory("Pizza");}
  if(entry.equals("c")||whole){
    System.out.println("*********************** CALZONES ***********************");
    Menu.displayCategory("Calzones");}


  
   }

 }

