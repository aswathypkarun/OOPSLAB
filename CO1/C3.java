//3.Add two complex number

import java.util.Scanner;
class C3
{
 double r,i;
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  C3 c1=new C3();
  C3 c2=new C3();
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

