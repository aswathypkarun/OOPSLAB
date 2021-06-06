
import java.util.Scanner;
class person{
    Scanner sc=new Scanner(System.in);
    String gend,addres,name;
    int age;
    person()
    {
        System.out.println("\nEnter Person Details:");
        System.out.println("Name:");
        name=sc.next();
        System.out.println("Address:");
        addres=sc.next();
        System.out.println("Gender:");
        gend=sc.next();
        System.out.println("Age:");
        age= sc.nextInt();
    }
}

class emplye extends person{
    int emplid,salry;
    String cmpny_name,qualification;
    Scanner sc=new Scanner(System.in);
    emplye()
    {
        System.out.println("\nEnter Empolyee Details");
        System.out.println("Company Name:");
        cmpny_name=sc.next();
        System.out.println("Employee ID:");
        emplid=sc.nextInt();
        System.out.println("Qualification:");
        qualification=sc.next();
        System.out.println("Salary:");
        salry=sc.nextInt();
    }
}
class tcher extends emplye{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    int techrID;
    tcher(){
        System.out.println("Enter Teacher Details:");
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        subj= sc.next();
        System.out.println("Teacher ID:");
        techrID= sc.nextInt();
    }
    void disp()
    {
        System.out.println("\n\n\tDetails are:");
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gend);
        System.out.println("Age: "+age);
        System.out.println("Company Name: "+cmpny_name);
        System.out.println("Employee ID: "+emplid);
        System.out.println("Qualification: "+qualification);
        System.out.println("Teacher ID: "+techrID);
        System.out.println("Address: "+addres);
        System.out.println("Subject: "+subj);
        System.out.println("Department: "+dept);
        System.out.println("Salary: "+salry);
    }
}
public class persn {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        tcher tr[]=new tcher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new tcher();
            
        }
       for (int i=0;i<n;i++)
        {
	tr[i].disp();
	}
    }
}
