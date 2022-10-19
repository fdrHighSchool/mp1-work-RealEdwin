import java.util.Scanner;
import java.util.Random;

public class UserName {
    public static void main(String[] args) {
        // create Scanner object
        Scanner s = new Scanner(System.in);
        
        // get String input from user
        System.out.print("Enter your first name: ");
        String firstName = s.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = s.nextLine();
        System.out.print("What is your favorite number?");
        String favNum = s.nextLine();
        System.out.print("Are you a teacher or a student?"); 
        String email = s.nextLine();
        email = email.toLowerCase();
        
        if (email.equals("student")) {
            System.out.println("Hello " + firstName + initialize(lastName) + favNum + "@nycstudents.net");
        }
        else {
            System.out.println("Hello " + initialize(firstName) + lastName + favNum + "@schools.nyc.gov");
        }
        s.close();
    }
    
        public static String initialize(String n) { 
            return n.substring(0, 1);
    }
    public static String generatePassword(int length) {
        String password = "";
        (int)(Math.random()*(90-65+1)+65);
        //need a loop of len"length"
        for(int i=o; i<length; i++){
            
        }
        
        //pull a random number from range (65=90 CAPS) (48-57 #s) (97-122 lower)
        
        //convert int to char (c =(char)i;)
        
        //append char to the String password (password = password + c)
        return password;
    }
}   

  
  // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
   // end initialize method

 // end class
