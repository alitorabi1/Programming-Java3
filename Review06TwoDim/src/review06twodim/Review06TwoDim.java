package review06twodim;

import java.util.Scanner;

public class Review06TwoDim {

    static Scanner input = new Scanner(System.in);

    static double[] inputOneDim(int size) {
        double[] data = new double[size];
        // TODO: ask user to enter floating point values
        // and store them in the array
        for (int i = 0; i < data.length; i++) {
            System.out.printf("Enter value for item #%d: ", i);
            double value = input.nextDouble();
            data[i] = value;
        }
        return data;
    }

    static double findMaxOneDim(double[] data) {
        double max = Double.MIN_VALUE;
        // Alternative: double max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[] dataOneDim = inputOneDim(5);
        System.out.println("MaxOneDim is " + findMaxOneDim(dataOneDim));
    }

}
