
/**
 * Write a description of class Lanternfly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Doing all of your assignments is very important ");
        System.out.print("for your grade. ");
        
        System.out.print("How many missing assignments do you have? ");
        int num = input.nextInt();
        
        if (num <2) {
            System.out.println("Nice!");
        } // end of statement
        else {
            System.out.println("Do your assignments!");
        } // end else statement
    
    } // end main method

} // end class
