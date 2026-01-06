/* Create an interface Calculator with methods add(int a, int b) and subtract(int a, int b).
 Implement a class BasicCalculator that implements this interface.
 */

//package Day5;
interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}
class BasicCalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
public class BasicCalculator {
    public static void main(String[] args) {
        BasicCalculatorImpl calculator = new BasicCalculatorImpl();
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
    }
}