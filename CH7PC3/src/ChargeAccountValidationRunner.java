/**
 * Richard Fitzgerald
 * Project
 * Programming III - AP
 * Date
 */
import java.util.Scanner;
public class ChargeAccountValidationRunner {

   
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // asks for number
        System.out.println("Please enter a charge account number.");
        // searches for the number entered
       ChargeAccountValidation search = new ChargeAccountValidation(keyboard.nextInt());
       search.validation();
        System.out.println(search.getAnswer());
    }

}
