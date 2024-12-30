import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNegativeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is positive");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is positive");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println(number3 + " is positive");
        } else if (number1 < number2 && number1 < number3) {
            System.out.println(number1 + " is negative");
        } else if (number2 < number1 && number2 < number3) {
            System.out.println(number2 + " is negative");
        } else if (number3 < number1 && number3 < number2) {
            System.out.println(number3 + " is negative");
        }

    }
}
