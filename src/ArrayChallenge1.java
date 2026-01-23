import java.util.ArrayList;
import java.util.List;

public class ArrayChallenge1 {

    public static void main(String[] args)
    {
        ArrayList<String> res1 = new ArrayList<String>();
        ArrayList<String> res2 = new ArrayList<String>();
        res1.addAll(List.of("Ram", "Rahim", "Albert", "John", "Amit", "Suresh", "Karan"));
        res2.addAll(List.of("Ram", "Albert", "Alex", "David", "Rohan", "Vikas", "Neha"));

        for (int i=0;i<res1.size();i++)
        {
            for (int j=0;j<res2.size();j++)
            {
                if (res2.get(j)==res1.get(i))
                {
                    System.out.println(res2.get(j));
                }
            }
        }
    }
}
