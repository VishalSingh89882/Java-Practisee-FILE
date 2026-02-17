package Recursion;

import java.util.Arrays;

public class Pattern1 {
    public static void main(String[] args)
    {
          //  triangle2(4,0);
        int[] res = {4,3,2,1,8};
       // bubbleSort(res,res.length-1,0);
        SelectionSort(res,res.length,0,0);
        System.out.println(Arrays.toString(res));
    }

    static void triangle(int r,int c)
    {
        if (r==0)
        {
            return;
        }
        if (c<r)
        {
            triangle(r,c+1);
            System.out.print("*");
        }
        else
        {

            triangle(r-1,0);
            System.out.println();

        }


    }



    static void triangle2(int r,int c)
    {
        if (r==0)
        {
            return;
        }
        if (c<r)
        {
            System.out.print("*");
            triangle2(r,c+1);


        }
        else
        {

            System.out.println();
            triangle2(r-1,0);

        }


    }


    static void bubbleSort(int[] arr,int r,int c)
    {
        if (r==0)
        {
            return;
        }
        if (c<r)
        {
            if (arr[c]>arr[c+1])
            {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr,r,c+1);
        }
        else
        {
            bubbleSort(arr,r-1,0);
        }
    }


    static void SelectionSort(int[] arr,int r,int c,int max)
    {
        if (r==0)
        {
            return;
        }
        if (c<r)
        {
            if (arr[c]>arr[max])
            {
                SelectionSort(arr,r,c+1,c);
            }
            else {
                SelectionSort(arr,r,c+1,max);

            }

        }
        else
        {
            int temp = arr[r-1];
            arr[r-1]=arr[max];
            arr[max]=temp;
            SelectionSort(arr,r-1,0,0);
        }
    }


}
