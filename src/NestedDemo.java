public class NestedDemo {
    private int x;
    int y;
    static private int z = 100;
    class Nested {
     void method1(){
         System.out.println(x);
         System.out.println(y);
         System.out.println(z);

     }
    }
    static class SataticNested {
        void method1() {
            System.out.println("Static nested class");
          //  System.out.println(x);
           // System.out.println(y);
            System.out.println(z);

        }
    }

    public static void main(String[] args)
    {
        NestedDemo nestedDemo = new NestedDemo();
        NestedDemo.Nested nested = nestedDemo.new Nested();
        nested.method1();
        NestedDemo.SataticNested sataticNested = new NestedDemo.SataticNested();
        sataticNested.method1();
    }
}
