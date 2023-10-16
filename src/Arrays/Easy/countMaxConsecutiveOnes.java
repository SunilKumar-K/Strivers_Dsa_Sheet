import java.util.Scanner;

public class countMaxConsecutiveOnes {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<arr.length;i++)
         {
            arr[i] = sc.nextInt();
         }

         System.out.println(countMaxConsecutiveOnes(arr));
    }

    static int countMaxConsecutiveOnes(int arr[])
    {
        int max=0,count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 1)
            {
                count++;
            }
            else{
                count = 0;
            }

            max = Math.max(count, max);
        }

        return max;
    }
    
}
