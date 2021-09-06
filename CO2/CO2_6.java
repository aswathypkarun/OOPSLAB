import java.awt.*;
import java.util.*;
interface prototypes{
    double pi= 3.14;
    void area();
    void perimeter();
}
class circle implements prototypes {
    Scanner sc = new Scanner(System.in);
    double r;
    circle()
    {
        System.out.println("Enter the radius:");
        r=sc.nextDouble();
    }
    public void area()
    {
        System.out.println("Area of circle:"+(pi*r*r));
    }
    @Override
    public void perimeter() 
     {
            System.out.println("Perimeter of circle:"+(2*pi*r));
     }
}
class rectangle implements prototypes
  {
    Scanner sc = new Scanner(System.in);
    double leng,bred;
    rectangle()
    {
        System.out.println("Enter length :");
        leng=sc.nextDouble();
        System.out.println("Enter breadth:");
        bred=sc.nextDouble();
    }
    public void area()
    {
        System.out.println("Area of rectangle:"+(leng*bred));
    }
    @Override
    public void perimeter()
  {
        System.out.println("Perimeter of rectangle:"+(2*(leng+bred)));
    }
}
class CO2_6
  {
    public static void main(String args[])
    {
        circle ci = new circle();
        rectangle re = new rectangle();
        Scanner sc = new Scanner(System.in);
        int c;
        do {
            System.out.println("\n\tMENU\n\t----\n1.Circle Area\n2.Circle Perimeter\n3.Rectangle Area\n4.Rectangle Perimeter\n5.Exit");
            System.out.println("Enter your choice:");
            c = sc.nextInt();
            switch (c)
             {
                case 1:ci.area();
                       break;
                case 2:ci.perimeter();
                       break;
                case 3:re.area();
                       break;
                case 4:re.perimeter();
                       break;
                case 5:System.exit(0);
                       break;
                default:System.out.println("Invalid");
                        break;
             }
        }while (c!=5);
    }
}