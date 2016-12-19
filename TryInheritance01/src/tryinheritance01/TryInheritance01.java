package tryinheritance01;

        // create 3 classes: Shapes, Circle, Polygone which Shapes is the father
//        define perimeter and surface for Shapes, radius for Circle, side for Polygone

class Shape extends Object {
    Shape (String name, String color) {
        this.name = name;
        this.color = color;
    }
    String name;
    String color;
    @Override
    public String toString() {
        return String.format("The name of shape is %.3f, and the color is: %.3f", name, color);
    }
}
//
class Circle extends Shape {
    Circle (String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }
    double radius;
    @Override
    public String toString() {
        return String.format("Te radius is %.3f, perimeter is: %.3f and area will be: %.3f "
                , radius, 2*3.14*radius, 3.14*radius*radius);
    }
}
//
class Square extends Shape {
    Square (String name, String color, double side) {
        super(name, color);
        this.side = side;
    }
    double side;
    @Override
    public String toString() {
        return String.format("The side is %.3f, perimeter is %.3f and area will be %.3f "
                , side, 4*side, side*side);
    }
}

public class TryInheritance01 {

    public static void main(String[] args) {
        
    }
    
}
