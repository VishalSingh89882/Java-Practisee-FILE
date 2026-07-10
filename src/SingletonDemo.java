public class SingletonDemo {

    static SingletonDemo instance = null;
    public int x = 10;

    private SingletonDemo() {

    }

    static public SingletonDemo getInstance() {
        if (instance == null)
        {
            instance = new SingletonDemo();
        }
        return instance;
    }
}
class Main1 {
    public static void main (String[] args)
    {
        SingletonDemo singletondemo1 =  SingletonDemo.getInstance();
        SingletonDemo singletondemo2 = SingletonDemo.getInstance();
        singletondemo1.x = singletondemo1.x + 10;

        System.out.println("Value of x in singletondemo1: " + singletondemo1.x);
        System.out.println("Value of x in singletondemo2: " + singletondemo2.x);
    }
}
