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

