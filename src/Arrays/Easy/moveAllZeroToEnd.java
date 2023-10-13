import java.util.Arrays;
import java.util.Scanner;

public class moveAllZeroToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(moveAllZeroToEnd(arr)));
    }

    public static int[] moveAllZeroToEnd(int arr[])
    {
        int arr1[] = new int[arr.length];
        int start = 0;
        int end = arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
                arr1[end--] = arr[i];
            }
            else{
                arr1[start++] = arr[i];
            }
        }
        return arr1;
    }
}
