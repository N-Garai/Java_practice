class Calculator {
    double i;

    double getSquareRoot() {
        return Math.sqrt(i);
    }
}

class CalculatorTest {
    public static void main(String args[]) {
        Calculator c = new Calculator();
        c.i = 16; // Assigning a value to i
        System.out.println("The square root of " + c.i + " is: " + c.getSquareRoot());
    }
}