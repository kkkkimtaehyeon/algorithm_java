import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] minuses = line.split("-");
        if (minuses[0].isEmpty()) {
            minuses[0] = "0";
        }

        int result = 0, sum;

        for (int i = 0; i < minuses.length; i++) {
            sum = 0;

            for (String plus: minuses[i].split("\\+")) {
                sum += Integer.parseInt(plus);
            }
            if (i == 0 && sum != 0) {
                result += sum;
            }
            else {
                result -= sum;
            }
        }

        System.out.println(result);
    }
}
