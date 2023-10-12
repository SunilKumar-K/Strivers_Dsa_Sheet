import java.util.Arrays;
import java.util.Scanner;

public class secondLargestSmallestElement{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int arr[] = new int[n];

         for(int i=0;i<arr.length;i++)
         {
            arr[i] = sc.nextInt();
         }
         System.out.println(Arrays.toString(secondLargestSmallestElement(arr)));
    }
// for only unique elements are present in the array.

   public static int[] secondLargestSmallestElement(int arr[])
   {
    if(arr.length<2)
    {
        return new int[] {-1,-1};
    }
    Arrays.sort(arr);
    return new int[] {arr[1],arr[arr.length-2]};
   }

   public static int[] secondLargestSmallestElement1(int arr[])
   {
    if(arr.length<2)
    {
        return new int[] {-1,-1};
    }
    int small = Integer.MAX_VALUE;
    int secondSmall = Integer.MAX_VALUE;
    int large = Integer.MIN_VALUE;
    int secondLarge = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        small = Math.min(small,arr[i]);
        large = Math.min(large, arr[i]);
    }
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]<secondSmall && arr[i] != small)
        {
            secondSmall = arr[i];
        }
        if(arr[i]>secondLarge && arr[i] != large)
        {
            secondLarge = arr[i];
        }
    }

    return new int[] {secondSmall,secondLarge};
   }
}