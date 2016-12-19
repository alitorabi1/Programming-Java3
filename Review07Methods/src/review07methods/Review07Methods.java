package review07methods;

import java.util.Scanner;

public class Review07Methods {

    static Scanner input = new Scanner(System.in);
     
    static int getNumericalGrade() {
    /*  TODO: Ask user for a numerical grade.
        Check if the grade is within 0-100 range.
        If not, display error message and return -1.
        If it is - return the grade. */
        System.out.print("Enter a grade 0-100: ");
        int grade = input.nextInt();
        input.nextLine(); // consume \n
        if ((grade < 0) || (grade > 100)) {
            System.out.println("Invalid value");
            return -1;
        }
        return grade;
    }
    
    static String getLetterGrade() {
    /*  TODO: Ask user for a letter grade. Check if the grade is a valid
        String of length 1 containing A, B, C, D, E, F.
        If not, display error message and return empty String.
        If it is - return the grade String. */    
        System.out.print("Enter a grade A, B, C, D, E, F: ");
        String grade = input.nextLine();
        switch (grade) {
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
            case "F":
                return grade;
            default:
                System.out.println("Invalid grade");
                return "";
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Grade you entered was: " + getNumericalGrade());
        System.out.println("Grade you entered was: " + getLetterGrade());
    }
   
}
