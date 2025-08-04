class Factorial {
    public static long factorial(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        int number = 5;
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        
        // Test with different values
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }
}
