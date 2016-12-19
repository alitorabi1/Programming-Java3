package review03scanner;

import java.util.Scanner;

public class Review03Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String [] friendList;
        //
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.print("How many friends? ");
        int num = input.nextInt();
        friendList = new String[num];
        
        input.nextLine(); // consume \n
        for (int i = 0; i < friendList.length; i++) {
            System.out.print("Enter name of your friend # " + (i + 1) + ": ");
            friendList[i] = input.nextLine();
        }
        System.out.println();
        System.out.printf("Got it, %s. Your best friends are ", name);
        for (int i = 0; i < friendList.length; i++) {
            if (i == friendList.length - 1) {
                // the last one is special
                System.out.print("and " + friendList[i] + ".");
            } else {
                System.out.print(friendList[i] + ", ");
            }
        }
    }
    
}
