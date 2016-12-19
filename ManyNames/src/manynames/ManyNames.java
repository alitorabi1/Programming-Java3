package manynames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManyNames {

    public static void main(String[] args) {
        // 1. Declare and instantiate ArrayList that operates on String type
        ArrayList<String> strArr = new ArrayList<String>();
        // 2. Using a loop, keep asking the user to enter a name
        // put each name into ArrayList, until user enters an empty name.
        Scanner input = new Scanner(System.in);
        String name = "";
        do {
            System.out.print("Enter a name: ");
            name = input.nextLine();
            if (!name.equals("")) strArr.add(name);
        }
        while(!name.equals(""));
        // 3. Using regular for loop display each element of the array,
        // all in one line
        for (int i=0; i < strArr.size(); i++) {
            System.out.println(strArr.get(i));
        }
//        }
        // 4. Sort the ArrayList alphabetically using Collections (research that!)
        Collections.sort(strArr);
        // 5. Using for-each loop display each element of the array, all in one line
        for (String cnt : strArr)
            System.out.println(cnt);
                
    }
    
}
