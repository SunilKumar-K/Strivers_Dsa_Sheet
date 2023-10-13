import java.util.Arrays;
import java.util.Scanner;

public class unionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(unionOfTwoSortedArrays(arr,ar)));
}

public static int[] unionOfTwoSortedArrays(int arr[], int ar[])
{
    
}
}
