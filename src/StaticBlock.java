class C{
    static int x;
    public C()
    {
        System.out.println("Inside constrcutor ");
    }
    static{
        x =50;
        System.out.println("Inside Static Block");
    }
}


public class StaticBlock {
    public static void main(String[] args)
    {
        C c = new C();
    }
}
