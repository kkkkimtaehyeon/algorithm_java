import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] point = new int[n];
        int degrading = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            point[i] = Integer.parseInt(br.readLine());
        }

        for (int i = n - 1; i > 0; i--) {
            if (point[i] <= point[i - 1]) {
                degrading = Math.abs(point[i] - point[i - 1]) + 1;
                count += degrading;
                point[i - 1] -= degrading;
            }
        }

        System.out.println(count);

    }
}
