package review10twoarrays;

import java.util.Scanner;

public class Review10TwoArrays {

    // similar to:
    // http://images.slideplayer.com/14/4300621/slides/slide_19.jpg
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] nameList = new String[5];
        int [] ageList = new int[5];
        // Ask user for names and age of 5 people
        for (int i=0; i<nameList.length; i++) {
            System.out.printf("Enter name #%d: ", i+1);
            nameList[i] = input.nextLine();
            System.out.printf("Enter age #%d: ", i+1);
            ageList[i] = input.nextInt();
            input.nextLine(); // consume \n leftover
        }
        System.out.println();
        // Find the person who is the oldest and display their name
        int maxAge = ageList[0];
        String oldestName = nameList[0];
        for (int i=0; i<nameList.length; i++) {
            if (maxAge < ageList[i]) {
                maxAge = ageList[i];
                oldestName = nameList[i];
            }
        }
        System.out.println("Oldest person is " + oldestName);
    }
    
}
