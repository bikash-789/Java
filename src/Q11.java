import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        int n, r;
        System.out.print("Enter 'n' and 'r': ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        r = input.nextInt();

        // Now find the Binomial coefficient
        int ans = factorial(n)/(factorial(r) * factorial(n-r));
        System.out.print("Binomial Co-efficient value: "+ans);
    }
    // Factorial function
    public static int factorial(int n)
    {
        // Base case
        if(n==0) return 1;

        // Recursive call
        int smallAns = factorial(n-1);

        // Small Calculation
        return smallAns * n;
    }
}
