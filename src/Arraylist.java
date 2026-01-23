import java.util.ArrayList;
public class Arraylist {

    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add('B');
        list.add("C");
        list.add(5);
        list.add(1,"z");
        list.remove("C");
        for (Object val : list)
        {
            System.out.println(val);
        }
        System.out.println(list.indexOf("C"));

        list.clear();
        if (list.isEmpty())
        {
            System.out.println("List is empty !");
        }


    }




}
