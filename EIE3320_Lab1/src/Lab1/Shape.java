//EIE3320 Lab 1
//Kwong Wai Ki 19030979D
//Wong Keith 19063076D
//Visual Studio Code

package Lab1;
public abstract class Shape implements Drawable {
//public abstract class Shape implements Drawable {
  protected float area;
  protected float perimeter;

  // To read the shape information from users
  public abstract void readShape();
  // To compute the shape’s area
  public abstract void computeArea();
  // To computer the shape’s perimeter
  public abstract void computePerimeter();
  // To display the area and perimeter of the shape
  public abstract void displayShape();
}
