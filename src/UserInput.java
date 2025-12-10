import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstword = sc.nextLine();
        System.out.println("You Entered: " + firstword);

        int a = sc.nextInt();
        System.out.println("You Entered: "+ a);

    }
}
