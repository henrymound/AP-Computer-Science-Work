import java.util.*;

public class FamousPizza{
  menu Menu = new menu();
  
  public static void main(String[] args){
    System.out.println("Welcome to the \"Famous Pizza\" Restaurant Checkout App!");
    Register user = new Register();
    user.getAction();   
  }
}

