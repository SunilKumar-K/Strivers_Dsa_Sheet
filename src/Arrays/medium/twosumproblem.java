package Arrays.medium;

import java.util.Arrays;
import java.util.Scanner;

public class twosumproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();

        System.out.println(Arrays.toString(twosumproblem(arr,sum)));
    }

    static int[] twosumproblem(int arr[],int sum)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(sum == arr[i]+arr[j])
                {
                    return new int[] {arr[i],arr[j]};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
