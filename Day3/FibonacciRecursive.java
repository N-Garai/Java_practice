public class FibonacciRecursive {
    public static long fibonacci(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    // Optimized version with memoization
    public static long fibonacciMemo(int n, long[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fibonacciMemo(n - 1, memo) + fibonacciMemo(n - 2, memo);
        return memo[n];
    }
    
    public static void main(String[] args) {
        int n = 10;
        
        // Basic recursive version
        System.out.println("Fibonacci sequence (basic recursion):");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        
        // Optimized version
        System.out.println("\nFibonacci sequence (memoized):");
        long[] memo = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciMemo(i, memo) + " ");
        }
        System.out.println();
    }
}
