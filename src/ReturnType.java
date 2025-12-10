public class ReturnType {
    public static void main(String[] args)
    {
        int a =maxnumber(30,32);
        System.out.println("Maximmum number  is " +a);
        System.out.println("Maximmum is " + maxnumber(20,50));
    }
    public static int maxnumber(int n1,int n2)
    {
        int max;
        if (n1>n2)
        {
            max=n1;
        }
        else {
            max=n2;
        }
        return max;
    }

    public static void WishThem(String name,int counter)
    {
        for (int i=0; i<counter; i++)
        {
            System.out.println(i + "  Good Morning: " + name);
        }

    }
}
