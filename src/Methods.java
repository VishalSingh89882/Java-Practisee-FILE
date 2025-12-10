public class Methods {
    public static void main(String[] args)
    {
      sayHello();
      sayHello();
      sayHello();
      String yourname="Vignesh";
      int count=2;
      WishThem("vishal",3);
      WishThem(yourname,count);
    }
    public static void sayHello()
    {
        System.out.println("Hello! Everyone");
    }

    public static void WishThem(String name,int counter)
    {
        for (int i=0; i<counter; i++)
        {
            System.out.println(i + "  Good Morning: " + name);
        }

    }
}
