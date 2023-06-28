import java.util.Scanner;

class authException extends Exception{
    
    public authException(String s){
       super(s);
    }
}

public class Q3{
  
  public static void main(String[] args){
  System.out.println("Name : Ashin Siby");
      System.out.println("Reg No: 22MCA014");
      System.out.println("Course Code and Name: 20MCA132, Object Oriented Programming Lab");
      System.out.println("Date:23/06/2023");
      System.out.println("---------------------------");
  
  
     String username = "student";
     String passcode = "student123";
     String user_name,password;
     Scanner sc = new Scanner(System.in);
     try
     {
       System.out.println("Enter username: ");
       user_name = sc.nextLine();
       
       System.out.println("Enter password: ");
       password = sc.nextLine();
       
       if(username.equals(user_name) && passcode.equals(password)){
         System.out.println("Authentication successful...");
       }
       else
          throw new authException("Invalid user credentials");
     }
     catch(authException e)
     {
       System.out.println("Exception caught "+e);
     }
  }
}
