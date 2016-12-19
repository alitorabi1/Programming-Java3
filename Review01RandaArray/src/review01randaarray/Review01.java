package review01randaarray;

import java.util.Random;

public class Review01 {

    public static void main(String[] args) {
        int[] randArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < randArray.length; i++) {
            // carefull with "off-by-one" errors
            int r = random.nextInt(100) + 1;
            randArray[i] = r;
        }
        // TODO: write for-each loop to display the numbers all in one line
        for (int v : randArray) {
            System.out.printf("%d, ", v);
        }
        for (int i=0; i<randArray.length; i++) {
            int v = randArray[i];
            System.out.printf("%d, ", v);
        }
            
    }

}
