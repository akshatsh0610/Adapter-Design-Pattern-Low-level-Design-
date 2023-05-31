public class main
{
    public static void main(String args[])
    {
        IPhone6s iphone6s = new IPhone6s(new Iphone4sTo6sAdapter());
        iphone6s.OnCharge();
    }
}
