import java.util.Scanner;

public class missingNumberInArray{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n-1];

         for(int i=0;i<arr.length;i++)
         {
            arr[i] = sc.nextInt();
         }

         System.out.println(missingNumberInArray(arr));
    }

    static int missingNumberInArray(int arr[])
    {
        if(arr[0] != 1)
        {
            return 1;
        }
        for(int i=2;i<=arr.length;i++)
        {
            if(i-1 != 1)
            {
                return i;
            }
        }
        return -1;

        //time complexity is o(n) and space complexity is o(1);
    }
}