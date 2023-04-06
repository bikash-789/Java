public class Main {
    public static int fib(int n)
    {
        // base case
        if(n==0 || n==1)
        {
            return n;
        }

        // small ans and recursive call
        int smallAns = fib(n-1)+fib(n-2);
        return smallAns;
    }

    // Recursive Function to find sum of digits of given integer
    public static int sumOfDigits(int n) {
        // base case
        if (n == 0) return 0;

        // recursive call
        int smallAns = sumOfDigits(n/10);

        // small calculation
        return smallAns + n%10;
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
        System.out.println(sumOfDigits(1));
    }
}