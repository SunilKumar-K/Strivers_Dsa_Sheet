import java.util.Scanner;

public class removeDuplicatesFormSortedArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(removeDuplicatesFormSortedArray(arr));
    }
    public static int removeDuplicatesFormSortedArray(int arr[])
    {
        int unique = 1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] != arr[i-1])
            {
                unique++;
            }
        }
        return unique;
    }
}