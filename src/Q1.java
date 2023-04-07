import java.util.*;
//Q1. Apply the Jagged Array Concept to the following array representation. The Following Jagged array stores the details of quantity of 4 different products on 5 different days. Find out the total quantity of all products in all the days

public class Q1 {
    public static void findTotalProducts()
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of days: ");
        n = input.nextInt();
        int store[][] = new int[n][];
        for(int i=0; i<n; i++) {
            int val=0, j=0;
            store[i] = new int[10];
            do{
//                System.out.println("Enter ["+(i)+"]["+(j)+"] element: ");
                if(input.hasNextInt()) {
                    val = input.nextInt();

                    if (val != -1) {
                        store[i][j++] = val;
                    }
                }
            }while(val != -1);
        }

        // Calculate the total products available in the store
        int totalProducts = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<store[i].length; j++)
            {
                totalProducts += store[i][j];
            }
        }
        System.out.println("Total products: " + totalProducts);
    }
    public static void main(String args[]) {
        findTotalProducts();
    }

}
