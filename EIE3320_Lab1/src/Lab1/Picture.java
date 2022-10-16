//EIE3320 Lab 1
//Kwong Wai Ki 19030979D
//Wong Keith 19067393D
//Visual Studio Code

package Lab1;
import java.util.*;
public class Picture {
  private ArrayList<Shape> shapes;
  public Picture()
  {
    shapes = new ArrayList<Shape>();
  }
  void addShape(Shape s) 
  {
    shapes.add(s);
  }

  void computeShape() {
    for(Shape shapeobject : shapes)
      {
        shapeobject.computeArea();
        shapeobject.computePerimeter();
      }
  }

  public void listAllShapeTypes() {
    for(Shape shapeobject : shapes)
      {
        shapeobject.displayShape();
      }
  }

  public void listSingleShapeType(String className) {
    for(Shape shapeobject : shapes)
      {
        if (className.equals(shapeobject.getClass().getSimpleName())) {shapeobject.displayShape();}
      }
  }
}
