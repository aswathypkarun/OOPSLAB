//1.Write a program to search an element in an array.

import java.util.Scanner;
class search 
{
  public static void main(String args[]) 
 {
  int[] a=new int[100];
  int i,n,s;
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter limit:");
  n=sc.nextInt();
  System.out.println("Enter the elements:");
    for(i=1;i<=n;i++)
	{
	  a[i]=sc.nextInt();			
	}
  System.out.println("Enter element to search:");
   s=sc.nextInt();
   for(i=1;i<=n;i++)
	{
	  if(s==a[i])
	   {
        	System.out.println(s+" Element found at position"+i);
		break;
		}
	   if(i==n)
		System.out.println("Element not found");
	  }
   }

}

OUTPUT
------

C:\Users\HP\Desktop\JAVA>javac Qns1.java

C:\Users\HP\Desktop\JAVA>java Qns1
Enter no. of elements you want in array:4
Enter all the elements:
23
34
44
67
Enter the element you want to find:32
Element not found

C:\Users\HP\Desktop\JAVA>java Qns1
Enter no. of elements you want in array:4
Enter all the elements:
23
34
45
56
Enter the element you want to find:23
Element found at position:1