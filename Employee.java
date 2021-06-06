
import java.util.*;
class employees {
    Scanner sc=new Scanner(System.in);
    int empid,salary;
    String Name,address;;
    employees()
    {
        System.out.println("Name:");
        Name= sc.next();
        System.out.println("Employee id:");
        empid= sc.nextInt();
        System.out.println("Salary:");
        salary=sc.nextInt();
        System.out.println("Address:");
        address=sc.next();
    }
}

class teacher extends employees{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    teacher(){
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        subj= sc.next();
    }
    void display()
    {
        
        System.out.println("\nName: "+Name);
        System.out.println("Employee ID: "+empid);
        System.out.println("Address: "+address);
        System.out.println("Subject: "+subj);
        System.out.println("Department:" +dept);
        System.out.println("Salary:" +salary);
    }
}

public class Employee{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        teacher tr[]=new teacher[n];
          System.out.println("Enter the details:");
        for (int i=0;i<n;i++)
        {
            tr[i]=new teacher();
           
        }
      System.out.println("\n\n\tDetails are:");
      for (int i=0;i<n;i++)
       {
        tr[i].display();
    }
   }
}