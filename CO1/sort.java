
import java.util.*;
class read
{
    Scanner sc=new Scanner(System.in);
    private static int n;
    private String a[];

    read() {
        System.out.println("Enter the limit:");
       n = sc.nextInt();
       a = new String[n];
        System.out.println("Enter some strings:");
        for(int i=0;i<n;i++)
        {
            a[i]= sc.next();
        }
    }
    void sorts()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
class sort {
    public static void main(String args[])
    {
        read r=new read();
        r.sorts();
    }
}
