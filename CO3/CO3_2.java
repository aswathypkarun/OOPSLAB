import java.util.*;
class customer
  {
    String name,bank;
    int accno,amnt;
    customer()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details:\n-------------");
        System.out.println("Name:");
        name = sc.next();
        System.out.println("Enter Bank:");
        bank = sc.next();
        System.out.println("Account no:");
        accno = sc.nextInt();
        System.out.println("Enter Amount:");
        amnt = sc.nextInt();
    }
}
class Investment
 {
    static void interest(customer c)
     {
        switch (c.bank)
          {
            case "FEDERAL":System.out.println("Interest at FEDERAL:"+(c.amnt*(8.4f/100f)));
                          break;
            case "KARUR":System.out.println("Interest at KARUR:"+(c.amnt*(7.3f/100f)));
                         break;
            case "BOI":System.out.println("Interest at BOI:"+(c.amnt*(9.7f/100f)));
                       break;
            default:System.exit(0);
                    break;
           }
     }
}
class CO3_2 
  {
    public static void main(String args[])
    {
        customer c = new customer();
        Investment.interest(c);
    }
}