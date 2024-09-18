import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static String converter(int i) {

        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int a = 0;
        for (i = 1; i <= 3; i++) {
            try {
                a = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException ignored) {
            }
        }

        a += 4 - i;
        System.out.println(converter(a));


    }
}