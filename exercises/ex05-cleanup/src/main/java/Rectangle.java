/**
 *Represents a rectangle with a width and a height.
 */

public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given dimensions.
   *
   * @param width the rectangle's width
   * @param height the rectangle's height
   */

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Calculates the rectangle's area.
   *
   * @return the width multiplied by the height
   */

  public double area() {
    return width * height;
  }
  /**
   * Scales the dimensions of the rectangle.
   *
   * @param factor the multiplier applied
   */

  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Compares this rectangle's area with another one.
   *
   * @param other the other rectangle
   * @return True if larger and False otherwise
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
