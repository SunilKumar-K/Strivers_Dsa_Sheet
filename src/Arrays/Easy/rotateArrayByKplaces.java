import java.util.Arrays;
import java.util.Scanner;

public class rotateArrayByKplaces{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(Arrays.toString(rotateArrayByKplaces(arr,k)));
    }

    public static int[] rotateArrayByKplaces(int arr[],int k)
    {
        int arr1[] = new int[arr.length];
        for(int i=0;i<k;i++)
        {
            arr1[i] = arr[arr.length-k+i];
        }
        for(int i=k;i<arr.length;i++)
        {
            arr1[i] = arr[i-k];
        }

        return arr1;
    }
}