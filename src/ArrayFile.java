import java.util.Arrays;
import java.util.Scanner;
public class ArrayFile {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int[]  arr = new int[4];
      for (int i=0; i<arr.length; i++) {
          arr[i]=sc.nextInt();
      }
//        for (int j : arr) {
//            System.out.println(j + "  ");
//        }

//        for (int i=0; i<arr.length; i++) {
//            System.out.print(arr[i] + "  ");
//        }
    int arr1[] = new int[] {1,2,3,4,5};
      int arr2[] = new int[] {101,102,103,104,105};

        System.out.println(Arrays.toString(arr1));
        displayarray(arr2);
    }

    public static void displayarray(int[] arr3)
    {
        System.out.println(Arrays.toString(arr3));
        }

    }

