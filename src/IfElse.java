import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age>21){
            System.out.println("You are eligible.");
        }
        else {
            System.out.println("You are not eligible.");
        }


    }
}
