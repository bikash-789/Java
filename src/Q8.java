import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        if(input.hasNextInt())
        {
            n = input.nextInt();
        }
        else return;

        int arr[] = new int[n];
        System.out.print("Enter integers: ");
        for(int i=0; i<n; i++)
        {
            if(input.hasNextInt())
            {
                arr[i] = input.nextInt();
            }
        }

        // Count no. of positive and negative integers in array
        int pCount = 0, nCount = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]<0)
            {
                nCount++;
            }
            else pCount++;
        }

        // Print output
        System.out.println("Positive integers count: "+pCount);
        System.out.println("Negative integers count: "+nCount);

    }
}
