/*8.Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ
information and Search for an employee given eNo, using the concept of Array of Objects*/


import java.util.Scanner;
class Qns8
{
 int eno,esalary;
 String ename;
 public static void main(String args[]) 
 {
  Scanner sc=new Scanner(System.in);
  Qns8[] e=new Qns8[100];
  System.out.println("Enter the limit");
  int n=sc.nextInt();
  for(int i=0;i<n;i++)
   {
     System.out.println("\n\tEnter the details:-\n");
     e[i]=new Qns8();
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

OUTPUT
------
C:\Users\HP\Desktop\JAVA>javac Qns8.java

C:\Users\HP\Desktop\JAVA>java Qns8
Enter the limit
4

        Enter the details:-

Enter the employee number:
23
Enter the employee name:
aswathy
Enter the employee salary:
2400

        Enter the details:-

Enter the employee number:
43
Enter the employee name:
arun
Enter the employee salary:
15000

        Enter the details:-

Enter the employee number:
56
Enter the employee name:
karun
Enter the employee salary:
56000

        Enter the details:-

Enter the employee number:
65
Enter the employee name:
kiran
Enter the employee salary:
34000

Enter the employee number to search:
43

                Employee details:
                ----------------
Name:arun
Employee number:43
Employee salary:15000