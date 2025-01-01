package tasksAboutLoops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Use the keyboard to enter a string: ");
        String string = reader.readLine();
        System.out.println(" A number N greater than 0: ");
        int number = Integer.parseInt(reader.readLine());

        while (number > 0) {
            System.out.println(string);
            number--;

        }

    }
}
