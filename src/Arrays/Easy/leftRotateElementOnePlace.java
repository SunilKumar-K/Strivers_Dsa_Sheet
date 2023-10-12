import java.util.Arrays;
import java.util.Scanner;

public class leftRotateElementOnePlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(leftRotateElementOnePlace(arr)));
    }

    public static int[] leftRotateElementOnePlace(int arr[])
    {
        int first = arr[arr.length-1];
        int arr1[] = new int[arr.length];
        arr1[0] = first;
        for(int i=1;i<arr.length;i++)
        {
            arr1[i] = arr[i-1];
        }
        return arr1;
    }
}
