public class ticketTester{

  public static void main(String[] args){
  
    Advance ticket1 = new Advance(10);
    StudentAdvance ticket2 = new StudentAdvance(3);
    Walkup ticket3 = new Walkup();
    System.out.println(ticket1+"\n");
    System.out.println(ticket2+"\n");
    System.out.println(ticket3);
  }

}