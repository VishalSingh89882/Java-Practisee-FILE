public class FinalVariable {
    final int finaldemo;
    final static int demovariable;
    static {
        demovariable = 250;
        System.out.println("Inside the  static block");
    }
    //static int demovar;
    {
       // finaldemo = 40;
        System.out.println("Inside the instance block");
    }

    public FinalVariable() {
        finaldemo = 300;
    }

    public static void main(String[] args)
    {
        final int a=100;
        System.out.println(a);
       // a = 50;
        FinalVariable finalvariable = new FinalVariable();
        FinalVariable finalvariable2 = new FinalVariable();


        System.out.println(finalvariable.finaldemo);
        finalvariable.method(400);
    }


    public void method(final int a)
    {
       // a = 500;
        System.out.println("In method: " + a);
    }
}
