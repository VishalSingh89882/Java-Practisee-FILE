public class MethodOverloading {
    public void add()
    {
        System.out.println("Output is: " + 0 );
    }

    public void add(int a )
    {
        System.out.println("Output is: " + a );
    }

    public void add(int a, int b)
    {
        System.out.println("Output is: " + (a+b) );
    }

    public void add(int a, int b, int c)
    {
        System.out.println("Output is: " + (a+b+c) );
    }
    public static void main(String[] args)
    {
     MethodOverloading var = new MethodOverloading();
     var.add();
     var.add(4);
     var.add(3,8);
     var.add(2,7,9);
    }
}
