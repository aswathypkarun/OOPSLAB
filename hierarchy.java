
import java.util.*;
abstract class publisher
{
    static int pid;
    static String name;
    Scanner sc=new Scanner(System.in);
   publisher()
   {
           System.out.println("Enter publisher details");
           System.out.println("Publiser name:");
           name=sc.next();
       System.out.println("Publiser Id:");
           pid=sc.nextInt();

   }
}
class book extends publisher
{
    String bname;
    int bid;
    Scanner sc=new Scanner(System.in);
    book()
    {
       System.out.println("Book details:");
        System.out.println("Book name");
        bname=sc.next();
        System.out.println("Book Id");
        bid=sc.nextInt();
    }
}
class liter extends book
{
    String chap;
    int chapno;
    Scanner sc=new Scanner(System.in);
    liter()
    {
        System.out.println("Chapter Name:");
        chap=sc.next();
        System.out.println("Chapter number:");
        chapno=sc.nextInt();
    }
}
class fiction extends liter
{
    String topic;
    Scanner sc=new Scanner(System.in);
    fiction()
    {
        System.out.println("Topic");
        topic=sc.next();
    }
    void displ()
    {
        System.out.println("\n\n\tDetails are:");
        System.out.println("\nPublisher Name:"+name);
        System.out.println("Publisher Id:"+pid);
        System.out.println("Book name:"+bname);
        System.out.println("Book Id:"+bid);
        System.out.println("Chapter:"+chap);
        System.out.println("Chapter Number"+chapno);
        System.out.println("Topic:"+topic);
     }
}
class hierarchy {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        fiction tr[]=new fiction[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new fiction();
           
        }
for (int i=0;i<n;i++)
        {
	 tr[i].displ();
      }
    }
}
