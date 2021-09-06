import java.util.*;
abstract class Shape
 {
    public int length,breath;
    abstract void printArea();
 }
class Rectangle extends Shape
 {
    Scanner sc = new Scanner(System.in);
    void printArea()
     {
        System.out.println("\n\tEnter Dimensions for Rectangle\n\t\t----------------");
        System.out.println("Enter length:");
        super.length = sc.nextInt();
        System.out.println("Enter breath:");
        super.breath = sc.nextInt();
        System.out.println("Area of rectangle:"+(length*breath));
     }
 }
class Triangle extends Shape
  {
    Scanner sc = new Scanner(System.in);
    void printArea()
     {
        System.out.println("\n\tEnter Dimensions for Triangle\n\t\t----------------");
        System.out.println("Enter height:");
        super.length = sc.nextInt();
        System.out.println("Enter breath:");
        super.breath = sc.nextInt();
        System.out.println("Area of triangle:"+(0.5f*length*breath));
     }
 }
class Circle extends Shape
  {
    Scanner sc = new Scanner(System.in);
    void printArea()
    {
        System.out.println("\n\tEnter Dimensions for Circle\n\t\t----------------");
        System.out.println("Enter radius:");
        super.length = sc.nextInt();
        System.out.println("Area of Circle:"+((3.14f)*length*length));
    }
  }
class CO3_1 
  {
    public static void main(String args[])
     {
        Shape s = new Rectangle();
        Shape s1 = new Triangle();
        Shape s2 = new Circle();
        s.printArea();
        s1.printArea();
        s2.printArea();
     }
}