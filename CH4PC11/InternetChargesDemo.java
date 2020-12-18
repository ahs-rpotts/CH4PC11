package CH4PC11;
import java.util.Scanner;


/**
 * Riley Potts
 * Programming III AP CS A 
 * Internet Charges CH4PC11
 * 12/11/2020
 */
public class InternetChargesDemo {

    public static void main(String[] args) {
        char packages;
        int hours = 0;
        double totalCharges = 0.0;
        String packages1 ;
        
        // create Scanner
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter the package letter: ");
        packages1 = keyboard.next();
        packages = packages1.charAt(0);

        //create object
        InternetCharges IC = new InternetCharges(packages, hours);
        
        //ask for hours
        System.out.println("How many hours did you use the internet? ");
        hours = keyboard.nextInt();
        
        //how much they could save
        
        // total cost
        System.out.println("Your total cost is " +
                IC.getTotalCharges());
        
    }

}
