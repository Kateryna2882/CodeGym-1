import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNumber {
    public static void main(String[] args)  {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter three integers:");

            int num1 = Integer.parseInt(reader.readLine());
            int num2 = Integer.parseInt(reader.readLine());
            int num3 = Integer.parseInt(reader.readLine());


            int positiveCount = 0;

            if (num1 > 0) positiveCount++;
            if (num2 > 0) positiveCount++;
            if (num3 > 0) positiveCount++;

            System.out.println(positiveCount);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}