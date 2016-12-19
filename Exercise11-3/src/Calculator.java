
import java.util.Scanner;

/*
Instead of using integers, use rationals, as shown in Figure 13.10a.
You will need to use the split method in the String class, introduced in
Section 10.10.3, Replacing and Splitting Strings, to retrieve the numerator string and
denominator string, and convert strings into integers using the Integer.parseInt
method. 
(a) The program takes three arguments (operand1, operator, and operand2)
from the command line and displays the expression and the result of the arithmetic
operation. 
(b) A complex number can be interpreted as a point in a plane.
*/

/**
 *
 * @author Baran Rayaneh
 */
public class Calculator {

    /**
     * Main method
     */
    public static void main(String[] args) {
        // Check number of strings passed
//        if (args.length != 3) {
//            System.out.println(
//                    "Usage: java Calculator operand1 operator operand2");
//            System.exit(0);
//        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number, operator and second number seperated by space, to calculate: ");
        String operation = input.nextLine();
        String[] operationArray = operation.split(" ");
        int operand1 = Integer.parseInt(operationArray[0]);
        String operator = operationArray[1];
        int operand2 = Integer.parseInt(operationArray[2]);
// The result of the operation
        int result = 0;

        // Determine the operator
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Divided by zero is not defined!");
                    return;
                }
                break;
            default:
                System.out.println("An Error occured in calculation.");
        }

        // Display result
        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }
}
