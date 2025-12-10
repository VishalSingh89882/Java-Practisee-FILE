import java.util.Scanner;
public class SwitchClass {
    public static void main(String[] args)
    {
        System.out.println("Enter the grade: ");
        Scanner sc = new Scanner(System.in);
        char grade =sc.next().charAt(0);
        switch (grade)
        {
            case 'A': {
                System.out.println("Excellent");
                break;
            }
            case 'B': {
                System.out.println("Amazing");
                break;
            }
            case 'C': {
                System.out.println("Well Done");
                break;
            }
            case 'D': {
                System.out.println("You can do better next time");
                break;
            }
            default:
                System.out.println("Invalid grade entered!");
                
        }
    }

}
