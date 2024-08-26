import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] archers = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int idx = 0;
        while(st.hasMoreTokens()) {
            archers[idx++] = Integer.parseInt(st.nextToken());
        }

        int count;
        int max = 0;
        for(int i = 0; i < n - 1; i++) {
            count = 0;
            for(int j = i+1; j < n; j++) {
                if (archers[i] < archers[j]) {
                    break;
                }
                if(archers[i] >= archers[j]) {
                    count++;
                }
            }
            max = Math.max(count, max);
        }

        System.out.println(max);

    }
}
