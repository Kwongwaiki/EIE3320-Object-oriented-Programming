//EIE3320 Lab 1
//Kwong Wai Ki 19030979D
//Wong Keith 19063076D
//Visual Studio Code

package Lab1;
import java.util.*;
import java.awt.geom.Ellipse2D;
public class Circle extends Shape implements Drawable{
  private float radius;
  public Circle(){}
  public Circle(float Radius)
  {
    radius = Radius;
  }
  public void readShape()
  {
    System.out.println("Please input the radius:");
    Scanner input = new Scanner(System.in);
    this.radius = input.nextFloat();
  }
  public void computeArea()
  {
    area = (float) (Math.PI * Math.pow(radius, 2));
  }
  public void computePerimeter()
  {
    perimeter = (float) (2 * Math.PI * radius);
  }
  public void displayShape()
  {
    System.out.println("Area of circle = " + area);
    System.out.println("Perimeter of circle = " + perimeter + "\n");
  }
  public void draw()
  {
    Canvas canvas = Canvas.getCanvas();
    float max = 300 - radius * 2;
    canvas.draw(this, "blue", new Ellipse2D.Float((float) ((Math.random() * max)), (float) ((Math.random() * max)), (radius*2), (radius*2))); 
    //remember to use the AWT's eclipse/circle to draw the circle on Canvas.
  }
}
