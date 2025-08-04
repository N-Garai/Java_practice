public class GCDRecursive {
    public static int gcd(int a, int b) {
        // Base case
        if (b == 0) {
            return a;
        }
        // Recursive case using Euclidean algorithm
        return gcd(b, a % b);
    }
    
    // Alternative implementation
    public static int gcdAlternative(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcdAlternative(a - b, b);
        } else {
            return gcdAlternative(a, b - a);
        }
    }
    
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
        System.out.println("GCD (alternative) of " + num1 + " and " + num2 + " is: " + gcdAlternative(num1, num2));
        
        // Test with more examples
        int[][] testCases = {{12, 8}, {25, 15}, {17, 13}, {100, 25}};
        for (int[] testCase : testCases) {
            System.out.println("GCD of " + testCase[0] + " and " + testCase[1] + " is: " + gcd(testCase[0], testCase[1]));
        }
    }
}
 
    

