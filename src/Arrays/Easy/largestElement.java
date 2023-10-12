import java.util.Arrays;
import java.util.Scanner;

public class largestElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(largestElement(arr));
        System.out.println(largestElement1(arr));
    }

    public static int largestElement1(int arr[])
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int largestElement(int arr[])
    {
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
}