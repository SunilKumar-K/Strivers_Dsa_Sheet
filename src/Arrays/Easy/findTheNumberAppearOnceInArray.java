import java.util.Scanner;

public class findTheNumberAppearOnceInArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];

         for(int i=0;i<arr.length;i++)
         {
            arr[i] = sc.nextInt();
         }

         System.out.println(findTheNumberAppearOnceInArray(arr));
    }

    static int findTheNumberAppearOnceInArray(int arr[])
    {
        int xor = 0;
        for(int i=0;i<arr.length;i++)
        {
            xor = xor^arr[i];
        }

        return xor;
    }
}
