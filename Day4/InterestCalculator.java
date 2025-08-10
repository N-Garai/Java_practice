package Day4;
import java.io.*;

class InterestCalculator {
    public static void main(String args[]) throws IOException {
        // Use BufferedReader for console input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float principalAmount = 0.0f;
        float rateOfInterest = 0.0f;
        int numberOfYears = 0;

        System.out.print("Enter Principal Amount: ");
        principalAmount = Float.parseFloat(br.readLine());

        System.out.print("Enter Rate of Interest: ");
        rateOfInterest = Float.parseFloat(br.readLine());

        System.out.print("Enter Number of Years: ");
        numberOfYears = Integer.parseInt(br.readLine());

        // Correct simple interest formula
        float interestTotal = (principalAmount * rateOfInterest * numberOfYears) / 100;

        System.out.println("Total Interest = " + interestTotal);
    }
}
