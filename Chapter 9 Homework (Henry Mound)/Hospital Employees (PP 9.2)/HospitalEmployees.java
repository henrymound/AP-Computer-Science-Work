public class HospitalEmployees{

  public static void main(String[] args){
    Janitor mike = new Janitor("Mike");
    Doctor katie = new Doctor("Katie");
    Surgeon dave = new Surgeon("Dave");
    Admininstrator daisy = new Admininstrator("Daisy");
    
    System.out.println(mike.getJobs());
    System.out.println(katie.getPatients());
    System.out.println(dave.getTools());
    System.out.println(daisy.getDepartment());
    
  }

}