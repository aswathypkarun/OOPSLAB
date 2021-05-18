//3.Add two complex number

import java.util.Scanner;
class Qns3
{
 double r,i;
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  Qns3 c1=new Qns3();
  Qns3 c2=new Qns3();
  System.out.println("Enter the complex number a:");
  c1.r=sc.nextDouble();
  c1.i=sc.nextDouble();
  System.out.println("Enter the complex number b:");
  c2.r=sc.nextDouble();
  c2.i=sc.nextDouble();
  double sr=c1.r+c2.r;
  double si=c1.i+c2.i;
  System.out.println("Sum:"+sr+"+"+si+"i");
 }
}

OUTPUT
------
C:\Users\HP\Desktop\JAVA>javac Qns3.java

C:\Users\HP\Desktop\JAVA>java Qns3
Enter the complex number a:
3
5
Enter the complex number b:
1
5
Sum:4.0+10.0i