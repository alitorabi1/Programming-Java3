package java3quiz1;

import java.util.Scanner;

public class Java3Quiz1 {

    static boolean isPrime(long value) {
        for (int div = 2; div <= value / 2; div++) {
            if (value % div == 0) {
                return false;
            }
        }
        return true;
    }
    
    static int getCorrectHeight() {
        // ask user for height from 30-250 (inclusive)
        System.out.print("Enter height 30-250: ");
        int height = input.nextInt();
        input.nextLine(); // consume \n leftover
        // if answer is within range return the value
        if ((height >= 30) && (height <= 250)) {
            return height;
        } else {
            // if not - display warning and return 0
            System.out.println("Invalid height");
            return 0;
        }
    }
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        String [] nameList;
        int [] heightList;
        nameList = new String[5];
        heightList = new int[5];
        // 1. Ask user for 5 names and 5 heights in cm
        // use getCorrectHeight() to ask for height          
        // 2. As you're asking - store data in the two arrays.
        for (int i=0; i<nameList.length; i++) {
            System.out.printf("Enter name #%d: ", i+1);
            nameList[i] = input.nextLine();            
            heightList[i] = getCorrectHeight();            
        }
        // 3. Find the average height and display it (as double)
        double sum = 0;
        for (int i=0; i<nameList.length; i++) {
            sum += heightList[i];
        }
        double average = sum / nameList.length;
        System.out.printf("Average height is: %.2f\n", average);
        // 4. Find all display all names of persons whose
        // height happens to be a prime number
        for (int i=0; i<nameList.length; i++) {
            if (isPrime(heightList[i])) {
                System.out.printf("%s has height that is a prime number\n",
                        nameList[i]);
            }
        }
    }
    
}
