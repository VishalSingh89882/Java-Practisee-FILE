import java.util.Scanner;
public class SwapVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first variable a: ");
        int a = sc.nextInt();
        System.out.println("Enter second  variable b: ");
        int b = sc.nextInt();
        int third_variable;
        third_variable=b;
        b=a;
        a=third_variable;

        System.out.println("After Swapping the variable.");
        System.out.println("the  first variable a: " + a);
        System.out.println("The  second  variable b: " + b);


    }
}
