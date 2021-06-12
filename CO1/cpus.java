class CPU {
    int price;
    CPU(int price)
    {
        this.price=price;
    }
    class  processor{
        processor(double core,String manufacturer)
        {
            System.out.println("Cores"+core);
            System.out.println("Manufacturer:"+manufacturer);
        }
    }
    static class RAM{
        RAM(double memory,String manufacturer)
        {
            System.out.println("Memory:"+memory+"TB");
            System.out.println("Manufacturer:"+manufacturer);
        }
    }
}
public class cpus
{
    public static void main(String args[])
    {
        CPU c = new CPU(56000);
        CPU.processor pr=c.new processor(6,"Arun");
        new CPU.RAM(1,"Arun");

    }
}