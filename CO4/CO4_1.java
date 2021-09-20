import java.util.*;
class rectangle extends Thread
{
    int length, breadth, height;
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tEnter dimensions for rectangle:");
        System.out.println("Enter length:");
        length = sc.nextInt();
        System.out.println("Enter breath:");
        breadth = sc.nextInt();
        System.out.println("Area of rectangle:"+length*breadth);
    }
 }
class square extends Thread
{
    int length;
    public void run() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tEnter dimensions for square:");
        System.out.println("Enter side:");
        length = sc.nextInt();
        System.out.println("Area of square:"+length * length);
    }
}
class triangle implements Runnable {
    int breadth, height;
    public void run() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tEnter dimensions for triangle:");
        System.out.println("Enter base:");
        breadth = sc.nextInt();
        System.out.println("Enter height:");
        height = sc.nextInt();
        System.out.println("Area of triangle:"+0.5f * breadth * height);
    }
}
class circle implements Runnable{
    int radius;
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        radius = sc.nextInt();
        System.out.println("Area of circle:"+3.14f * radius);
    }
}
class CO4_1 {
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        rectangle t1 = new rectangle();
        square t2 = new square();
        triangle r1 = new triangle();
        circle r2 = new circle();
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);
        int c;
        do{
            System.out.println("\n1.Area of rectangle\n2.Area of square\n3.Area of triangle\n4.Area of circle\n5.Exit\n\tEnter your option:");
            c = sc.nextInt();
            switch (c){
                case 1:t1.start();
                t1.join();
                break;
                case 2:t2.start();
                t2.join();
                break;
                case 3:t3.start();
                t3.join();
                break;
                case 4:t4.start();
                t4.join();
                break;
                case 5:System.exit(0);
                break;
                default:System.out.println("Invalid");
                break;
            }
        }while (c!=5);
    }
}