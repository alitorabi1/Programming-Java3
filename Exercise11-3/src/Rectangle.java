/*
(Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
extend GeometricObject and implement the Comparable interface. Override
the equals method in the Object class. Two Rectangle objects are equal
if their areas are the same. Draw the UML diagram that involves Rectangle,
GeometricObject, and Comparable. */

/**
 *
 * @author Baran Rayaneh
 */
public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
  private double width;
  private double height;

  public Rectangle() {
  }

  public Rectangle(double width, double height) {
    setWidth(width);
    setHeight(height);
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  /** Return area */
  public double getArea() {
    return width * height;
  }

  /** Return perimeter */
  public double getPerimeter() {
    return 2 * (width + height);
  }

    @Override
    public int compareTo(Rectangle o) {
        if (this.getArea() == o.getArea()) {
            return 0;
        }
        if (this.getArea() > o.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }
}
