import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n;
        if(input.hasNextInt())
        {
            n = input.nextInt();
        }
        else return;
        // Create an array of n integers
        int arr[] = new int[n];

        // Store the integers into array
        System.out.print("Enter integers: ");
        for(int i=0; i<n; i++)
        {
            if(input.hasNextInt())
            {
                arr[i] = input.nextInt();
            }
        }

        //find the smallest and largest integers from array
        int largest = -99999, smallest = 99999;
        for(int i=0; i<n; i++)
        {
            if(arr[i]<smallest)
            {
                smallest = arr[i];
            }
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }

        // Print the smallest and largest number
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: "+smallest);
    }
}
