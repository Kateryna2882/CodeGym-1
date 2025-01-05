package tasksAboutLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adding {
    public static void main(String[] args) throws IOException {
/*
Let's write a program where we need to enter numbers from the keyboard, and as soon as -1 is entered, then we display the sum of all the entered numbers on the screen and exit the program.
-1 should be included in the sum.

Hint: One of the solutions to this problem uses the following construct:
while (true) {
int number = read the number;
if (check whether the number is -1)
break;
}
*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            sum += number;
            if (number == -1) {
                break;

            }
        }
        System.out.println(sum);


    }

}


