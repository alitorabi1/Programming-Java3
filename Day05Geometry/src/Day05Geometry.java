import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

abstract class GeoObj implements Comparable<GeoObj> {

    double area, circuperim; // Circumference or Perimeter
    int vertices;

    @Override
    public String toString() {
        return String.format("%s: c: %.2f, a: %.2f, v: %d",
                this.getClass().getSimpleName(), circuperim, area, vertices);
    }
    
    @Override
    public int compareTo(GeoObj go) {
        // System.out.print("C ");
        if (area == go.area) {
            return 0;
        }
        if (area < go.area) {
            return 1;
        } else {
            return -1;
        }
    }
}

class CompareGeoObjByCircuperim implements Comparator<GeoObj>  {
    @Override
    public int compare(GeoObj o1, GeoObj o2) {
        if (o1.circuperim == o2.circuperim) {
            return 0;
        }
        if (o1.circuperim < o2.circuperim) {
            return 1;
        } else {
            return -1;
        }
    }
}

class CompareGeoObjByVertices implements Comparator<GeoObj>  {
    @Override
    public int compare(GeoObj o1, GeoObj o2) {
        return o1.vertices - o2.vertices;
    }
}

class Rectangle extends GeoObj {

    double height, width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        area = height * width;
        circuperim = 2 * height + 2 * width;
        vertices = 4;
    }
}
// TODO: implement classes: Point, Square, Circle, RightAngleTriangle
// TODO: create 2 instances of each, add to ArrayList<GeoObj>
// TODO: print result of toString on each element on a single line

class Point extends GeoObj {

    Point() {
        vertices = 1;
    }
}

class Square extends Rectangle {

    Square(double edge) {
        super(edge, edge);
    }
}

class Circle extends GeoObj {
    double radius;
    Circle(double radius) {
        this.radius = radius;
        area = radius * radius * Math.PI;
        circuperim = 2 * Math.PI * radius;
    }
}

class RightAngleTriangle extends GeoObj {
    double base, height;
    RightAngleTriangle(double base, double height) {
        this.base = base;
        this.height = height;
        area = base * height * 0.5;
        circuperim = base + height + Math.hypot(base, height);
        vertices = 3;
    }
}

public class Day05Geometry {

    public static void main(String[] args) {
        ArrayList<GeoObj> shapes = new ArrayList<>();
        shapes.add(new RightAngleTriangle(2,3));
        shapes.add(new Circle(5));
        shapes.add(new Square(3));
        shapes.add(new Point());
        shapes.add(new Rectangle(2, 4));
        //
        for (GeoObj g : shapes) {
            System.out.println(g);
        }
        //
        Collections.sort(shapes);
        System.out.println("Sorted naturally by area:");
        for (GeoObj g : shapes) {
            System.out.println(g);
        }
        //
        shapes.sort(new CompareGeoObjByCircuperim());        
        System.out.println("Sorted by circumference / perimiter:");
        for (GeoObj g : shapes) {
            System.out.println(g);
        }
        //
        shapes.sort(new CompareGeoObjByVertices());
        System.out.println("Sorted by vertices:");
        for (GeoObj g : shapes) {
            System.out.println(g);
        }
    }

}