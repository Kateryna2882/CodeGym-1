import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DravingRectagle {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Use the keyboard to enter  number m");
        int m = Integer.parseInt(reader.readLine());

        System.out.println("Use the keyboard to enter  number n");
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.println("8");

            }
            System.out.println();

        }
    }
}