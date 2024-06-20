package exception;

import java.util.Scanner;

public class A {

    void authentication(){
        String user;
        String password;
        
        Scanner sc = new Scanner(System.in);
        
  
        try {
        	 System.out.println("Enter the user");
             user = sc.nextLine(); // Use nextLine() to read the entire line
             
            if (!user.equals("Admin1")) {
                throw new InvalidUserException("Invalid User");
            } 
            
            System.out.println("Enter the password");
            password = sc.nextLine(); // Use nextLine() to read the entire line
           
            if (!password.equals("Password")) {
                throw new InvalidPasswordException("Invalid Password");
            } 
            System.out.println("Login successfully");
        } catch (InvalidUserException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        A a = new A();
        a.authentication();
    }
}
