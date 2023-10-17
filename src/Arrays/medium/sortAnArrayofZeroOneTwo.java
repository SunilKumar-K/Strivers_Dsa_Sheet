package Arrays.medium;

import java.util.Arrays;
import java.util.Scanner;

public class sortAnArrayofZeroOneTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(sortAnArrayofZeroOneTwo(arr)));
    }

    public static int[] sortAnArrayofZeroOneTwo(int arr[])
    {
         int zero = 0, one = 0, two = 0;
        for(int i=0;i<arr.length;i++)
        {
           
            if(arr[i]==0)
            {
                zero++;
            }else if(arr[i] == 1)
            {
                one++;
            }
            else{
                two++;
            }
        }
        int nums[] = new int[zero+one+two];
        for(int i=0;i<zero;i++)
        {
            nums[i] = 0;
        }
         for(int i=zero;i<zero+one;i++)
        {
            nums[i] = 1;
        }
         for(int i=zero+one;i<zero+one+two;i++)
        {
            nums[i] = 2;
        }

        return nums;
    }
}
