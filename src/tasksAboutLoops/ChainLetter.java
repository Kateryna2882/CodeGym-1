package tasksAboutLoops;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String text = name + " loves me.";

        for (int i = 0; i < 10; i++) {
            System.out.println(text);
        }
    }
}
