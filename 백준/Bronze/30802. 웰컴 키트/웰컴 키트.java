import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] clothes = new double[6];
        for (int i = 0; i < 6; i++) {
            clothes[i] = Double.parseDouble(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        double t = Double.parseDouble(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int clothCount = 0;
        for (double size : clothes) {
            clothCount += (int) Math.ceil(size / t);
        }
        int penSet = n / p;
        int penRest = n % p;

        System.out.println(clothCount + "\n" + penSet + " " + penRest);
    }
}