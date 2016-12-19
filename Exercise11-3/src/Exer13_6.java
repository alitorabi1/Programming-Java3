
import java.util.Comparator;

/*
*13.6 (The ComparableCircle class) Define a class named ComparableCircle
that extends Circle and implements Comparable. Draw the UML diagram and
implement the compareTo method to compare the circles on the basis of area.
Write a test class to find the larger of two instances of ComparableCircle objects. */
/**
 *
 * @author Baran Rayaneh
 */
public class Exer13_6 {

//    public static void main(String[] args) {
//        // Create two comarable rectangles
//        ComparableCircle circle1 = new ComparableCircle(5);
//        ComparableCircle circle2 = new ComparableCircle(15);
//
//        // Display the max rect
////        ComparableCircle circle3 = (ComparableCircle) Max.max(circle1, circle2);
////        System.out.println("The max circle's radius is " + circle3.getRadius());
////        System.out.println(circle3);
//    }
}

class Circle {

    double radius;

    public void setRadius(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() == o.getRadius()) {
            return 0;
        }
        if (getRadius() > o.getRadius()) {
            return 1;
        } else {
            return -1;
        }
    }

    class FindLargestCC implements Comparator<ComparableCircle> {

        @Override
        public int compare(ComparableCircle o1, ComparableCircle o2) {
            if (o1.compareTo(o2) == 0) {
                return 0;
            }
            if (o1.compareTo(o2) > 0) {
                return 1;
            } else {
                return -1;
            }
        }

    }

}
