import java.util.Scanner;

public class longestSubArraywithGivenSum{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();

        System.out.println(longestSubArraywithGivenSum(arr,sum));
    }

    public static int longestSubArraywithGivenSum(int arr[],int sum)
    {
        int currsum =0; int subArray = 0;
        int j = 0;
         for(int i=0;i<arr.length;i++)
         {
            if(sum >= currsum)
            {
                currsum += arr[i];
                j++;
            }

            if (sum == currsum)
            {
                subArray = Math.max(j,subArray);
            }
         }

         return subArray;
    }
    
}