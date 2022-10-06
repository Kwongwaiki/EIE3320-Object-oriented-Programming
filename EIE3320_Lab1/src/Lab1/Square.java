//EIE3320 Lab 1
//Kwong Wai Ki 19030979D
//Wong Keith 19063076D
//Visual Studio Code

package Lab1;
import java.util.*;
import java.awt.geom.Rectangle2D;
public class Square extends Shape implements Drawable{
  private float length;
  public Square(){}
  public Square(float Length)
  {
    length = Length;
  }
  public void readShape()
  {
    System.out.println("Please input the length:");
    Scanner input = new Scanner(System.in);
    length = input.nextFloat();
  }
  public void computeArea()
  {
    area = (float) (Math.pow(length, 2));
  }
  public void computePerimeter()
  {
    perimeter = (float) (4 * length);
  }
  public void displayShape()
  {
    System.out.println("Area of square = " + area);
    System.out.println("Perimeter of square = " + perimeter + "\n");
  }
  public void draw()
  {
    Canvas canvas = Canvas.getCanvas();
    float max = 300 - length;
    canvas.draw(this, "blue", new Rectangle2D.Float((float) (Math.random() * max), (float) (Math.random() * max), length, length));
  }
}
