/*8.Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ
information and Search for an employee given eNo, using the concept of Array of Objects*/


import java.util.Scanner;
class C8
{
 int eno,esalary;
 String ename;
 public static void main(String args[]) 
 {
  Scanner sc=new Scanner(System.in);
  C8[] e=new C8[100];
  System.out.println("Enter the limit");
  int n=sc.nextInt();
  for(int i=0;i<n;i++)
   {
     System.out.println("\n\tEnter the details:-\n");
     e[i]=new C8();
     System.out.println("Enter the employee number:");
     e[i].eno=sc.nextInt();
     System.out.println("Enter the employee name:");
     e[i].ename=sc.next();
     System.out.println("Enter the employee salary:");
     e[i].esalary=sc.nextInt();
    
     }
   System.out.println("\nEnter the employee number to search:");
   int enoo=sc.nextInt();
     for(int i=0;i<n;i++)
       {
	if(e[i].eno==enoo)
	{
	 System.out.println("\n\t\tEmployee details:");
         System.out.println("\t\t----------------");
	 System.out.println("Name:"+e[i].ename+"\nEmployee number:"+e[i].eno+"\nEmployee salary:"+e[i].esalary);
	  break;
	 }
	if(i==n-1)
	{
	  System.out.println("Employee not found:");
	 }
    }
 }
}

