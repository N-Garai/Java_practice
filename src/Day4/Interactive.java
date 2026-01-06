package Day4;
//import java.util.*;      // For StringTokenizer
import java.io.*;        // For I/O classes

public class Interactive{
    public static void main(String[] args) {
        try {
            // Use BufferedReader for console input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter code number:");
            int code = Integer.parseInt(br.readLine().trim());

            System.out.println("Enter number of items:");
            int items = Integer.parseInt(br.readLine().trim());

            System.out.println("Enter cost per item:");
            double cost = Double.parseDouble(br.readLine().trim());

            // Write data to binary file "invent.dat"
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("invent.dat"));
            dos.writeInt(code);
            dos.writeInt(items);
            dos.writeDouble(cost);
            dos.close();

            // Read data back from file
            DataInputStream dis = new DataInputStream(new FileInputStream("invent.dat"));
            int codeNumber = dis.readInt();
            int totalItems = dis.readInt();
            double itemCost = dis.readDouble();
            dis.close();

            // Process and display results
            double totalCost = totalItems * itemCost;
            System.out.println();
            System.out.println("Code Number : " + codeNumber);
            System.out.println("Item Cost   : " + itemCost);
            System.out.println("Total Items : " + totalItems);
            System.out.println("Total Cost  : " + totalCost);

        } catch (IOException e) {
            System.out.println("Error during I/O operation: " + e.getMessage());
        }
    }
}
