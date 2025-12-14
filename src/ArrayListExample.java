import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer>  list = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(75);
        System.out.println(list.contains(45));
        System.out.println(list.contains(75));
        System.out.println(list);
        list.set(0,100);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

//        for (int i=0; i<5; i++)
//        {
//            list.add(sc.nextInt());
//        }
//        System.out.println(list);

        System.out.println(list.get(3));

    }


}
