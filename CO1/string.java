
import java.awt.*;
import java.util.*;
class manipulation {
    Scanner sc = new Scanner(System.in);
    private static String str;
    void get()
    {
        System.out.println("\nEnter a string:");
        str=sc.next();
    }
    void compare()
    {
        System.out.println("\nEnter another stirng to compare:");
        String str2=sc.next();
        if(str.compareTo(str2)==0)
        {
            System.out.println("Both are same\n");
        }
        else
        {
            System.out.println("Both are not same\n");
        }
    }
    void concat()
    {
        System.out.println("\nEnter string to concatenate :");
        String str2=sc.next();
        String str3=str+str2;
        System.out.println(str3);
    }
    void length()
    {
        System.out.println("\nLength of "+str+" is: "+str.length());
    }
    void upper_lower()
    {
        System.out.println("\nUpper case:"+str.toUpperCase());
        System.out.println("\nLower case:"+str.toLowerCase());
    }
    void reverse()
    {
        StringBuilder sb=new StringBuilder(str);
        System.out.println("\nReverse of "+str+" is:"+sb.reverse());
    }
    
}
 class string {
    public static void main(String args[]) {
        int n;
        manipulation m = new manipulation();
        Scanner sc = new Scanner(System.in);
        m.get();
        do {
            System.out.println("\n1.Length\n2.Compare\n3.Concatenate\n4.Upper case & Lower case\n5.Reverse\n6.Exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    m.length();
                    break;
                case 2:
                    m.compare();
                    break;
                case 3:
                    m.concat();
                    break;
                case 4:
                    m.upper_lower();
                    break;
                case 5:
                    m.reverse();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }while (n != 6) ;
    }

}
