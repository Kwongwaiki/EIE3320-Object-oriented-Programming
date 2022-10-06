//EIE3320 Lab 1
//Kwong Wai Ki 19030979D
//Wong Keith 19063076D
//Visual Studio Code

package Lab1;
import java.util.*;
import java.awt.geom.Rectangle2D;
public class Rectangle extends Shape implements Drawable{
  private float length;
  private float width;
  public Rectangle(){}
  public Rectangle(float Length, float Width)
  {
    length = Length;
    width = Width;
  }
  public void readShape()
  {
    System.out.println("Please input the length:");
    Scanner input = new Scanner(System.in);
    length = input.nextFloat();
    System.out.println("Please input the width:");
    width = input.nextFloat();
  }
  public void computeArea()
  {
    area = (float) (length * width);
  }
  public void computePerimeter()
  {
    perimeter = (float) (2 * (length + width));
  }
  public void displayShape()
  {
    System.out.println("Area of rectangle = " + area);
    System.out.println("Perimeter of rectangle = " + perimeter + "\n");
  }
  public void draw()
  {
    Canvas canvas = Canvas.getCanvas();
    float maxWidth = 300 - width;
    float maxLength = 300 - length;
    canvas.draw(this, "blue", new Rectangle2D.Float((float) ((Math.random() * maxWidth)), (float) ((Math.random() * maxLength)), width, length));
  }
}
