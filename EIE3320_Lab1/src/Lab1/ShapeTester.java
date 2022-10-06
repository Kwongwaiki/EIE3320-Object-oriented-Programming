//EIE3320 Lab 1
//Kwong Wai Ki 19030979D
//Wong Keith 19063076D
//Visual Studio Code

package Lab1;
import java.util.*;
public class ShapeTester {
  public static void main(String[] args) {
    // Create a Scanner object
    String choice;
    Shape ShapeObject = null;
    menu:
    while (true)
    {
      Scanner input = new Scanner(System.in);
      System.out.println("**************************************");
      System.out.printf("%-37s*\n","* Please choose one the followings:");
      System.out.printf("%-37s*\n","* Press 'c' - Circle");
      System.out.printf("%-37s*\n","* Press 's' - Square");
      System.out.printf("%-37s*\n","* Press 'r' - Rectangle");
      System.out.printf("%-37s*\n","* Press 'x' - EXIT");
      System.out.println("**************************************\n");
      choice = input.nextLine();
      
      if (choice.length()!=1) 
      {
        System.out.println("Invalid command!\n");
        continue menu;
      }
      switch (choice.charAt(0))
      {
        case 'c':
          {ShapeObject = new Circle();}
          break;
        case 's':
          {ShapeObject = new Square();}
          break;
        case 'r':
          {ShapeObject = new Rectangle();}
          break;
        case 'x':
          System.exit(0);
        default:
          System.out.println("Invalid command!\n");
          continue menu;
      }
      ShapeObject.readShape();
      ShapeObject.computeArea();
      ShapeObject.computePerimeter();
      ShapeObject.displayShape();
      ShapeObject.draw();
    }
  }
}
