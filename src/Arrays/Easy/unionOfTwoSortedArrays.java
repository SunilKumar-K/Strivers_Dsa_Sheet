
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
    int nums[] = new int[arr.length+ar.length];
    int j,k =0;
    int len = arr.length>ar.length ? arr.length, ar.length;
    for(int i=0;i<nums.length;i++)
    {
        if(arr[j] < ar[k])
        {
            nums[i] = arr[j++];
        }
        else{
            nums[i] = ar[k++];
        }
    }
    {

    }
    
}
}
