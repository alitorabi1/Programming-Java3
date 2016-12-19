package review09stringarray;

import java.util.Scanner;

public class Review09StringArray {
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declare array of 5 Strings.
        String [] nameArray = new String[5];
        // Ask user for names of 5 people and save them in the array.
        for (int i=0; i < nameArray.length; i++) {
            System.out.printf("Enter name %d: ", i+1);
            nameArray[i] = input.nextLine();
        }
        // Ask user for an integer number.
        System.out.println("Enter a number: ");
        int maxLen = input.nextInt();
        input.nextLine(); // consume the \n leftover
        // Display all names from the array that are shorter
        // (length of the string) than the integer number provided.
        for (int i=0; i < nameArray.length; i++) {
            String name = nameArray[i];
            if (name.length() < maxLen) {
                System.out.printf("Name shorter than %d is: %s\n", maxLen, name);
            }
        }
    }
    
}
