public class StaticMethod {
    public static void printMessage()
    {
        System.out.println("inside the static method" );

    }
    public   void PrintNormalMessage()
    {
        System.out.println("inside the normal method");
    }
}

class MainClass {
    public static void main(String[] args)
    {
        StaticMethod.printMessage();
        StaticMethod printNormal = new StaticMethod();
        printNormal.PrintNormalMessage();
        StaticChild.printMessage();
    }
}
