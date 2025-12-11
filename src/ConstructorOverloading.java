public class ConstructorOverloading {
    public static void main(String[] args){
        ConstructorOverloading var = new ConstructorOverloading();
        ConstructorOverloading var1 = new ConstructorOverloading(5);
        ConstructorOverloading var2 = new ConstructorOverloading(4,6);
      //  ConstructorOverloading var3 = new ConstructorOverloading(4,"a");


    }
    public ConstructorOverloading()
    {
        System.out.println("Constructor overloading with no parameters are called.");
    }
    public ConstructorOverloading(int a )
    {
        System.out.println("Constructor overloading with 1 int  parameters are called.");
    }
    public ConstructorOverloading(int a,int b)
    {
        System.out.println("Constructor overloading with 2 int  parameters are called.");
    }
    public ConstructorOverloading(int a,String b)
    {
        System.out.println("Constructor overloading with 1 int and 1 string  parameters are called.");
    }
}
