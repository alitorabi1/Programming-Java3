package triangle;

import java.util.Scanner;

public class Triangle extends GeometricObject {

    private static double side1 = 1.0;
    private static double side2 = 1.0;
    private static double side3 = 1.0;

    Triangle() {
    }

    Triangle(double side1, double side2, double side3) {
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }
    
    public static double getArea(double side1, double side2, double side3) {
        return (side1 + side2 + side3) / 2;
    }

    public static double getPerimeter(double side1, double side2, double side3) {
        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return String.format("Triangle: side1 = %.3f,  side2 = %.3f,  side3 = %.3f", side1, side2, side3);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1: ");
        side1 = input.nextDouble();
        System.out.print("Enter side2: ");
        side2 = input.nextDouble();
        System.out.print("Enter side3: ");
        side3 = input.nextDouble();
        //
        System.out.print("Enter color: ");
        String color = input.next();
        //
        System.out.print("Enter true if triangle is filled and false if is not: ");
        boolean filled = input.nextBoolean();
        String isFilled = (filled) ? "filled" : "not filled";
        //
        System.out.printf("\nThe area is %.3f, perimeter is %.3f, color is %.3s, and Triangle is %s"
                , getArea(side1, side2, side3), getPerimeter(side1, side2, side3), color, isFilled);
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

}
