package Encapsulation;

public class DataEncapsulation {
    public static void main(String[] args)
    {
     A a = new A();
     System.out.println("The value of variable is: "+ a.getVar());
     a.setVar(900);
     System.out.println("The value of variable is: "+ a.getVar());
     a.setVar(9000);
     System.out.println("The value of variable is: "+ a.getVar());

    }
}
