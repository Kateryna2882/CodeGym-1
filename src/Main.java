import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter command: Enter an integer from the keyboard in the range 1 - 999. ");
//        int n = Integer.parseInt(reader.readLine());
        String input = reader.readLine();
        int n;
        try {
            n = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }

        if (n < 1 || n > 999) {
            System.out.println("Enter an integer from the keyboard in the range 1 - 999. ");
        } else if (n <= 9 && n % 2 == 0) {
            System.out.println("even single-digit number");
        } else if (n <= 9 && n % 2 == 1) {
            System.out.println("odd single-digit number");
        } else if ((n >= 10 && n <= 99) && (n % 2 == 0)) {
            System.out.println("even two-digit number");
        } else if ((n >= 10 && n <= 99) && (n % 2 == 1)  ) {
            System.out.println("odd two-digit number");
        } else if ((n >= 100 && n <= 999) && (n % 2 == 0)) {
            System.out.println("even three-digit number");
        } else if ((n >= 100 && n <= 999) && (n % 2 == 1)  ) {
            System.out.println("odd three-digit number");
        } else {
            System.out.println("invalid command");
        }
    }
}