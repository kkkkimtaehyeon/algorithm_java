import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void search(long left, long right, ArrayList<Long> list, int goal) {
        long mid = 0;
        long max = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            long sum = 0;
            for (Long n : list) {
                sum += (n / mid);
            }
            if (sum >= goal) {
                max = mid;
                left = mid + 1;
            } else if (sum < goal) {
                right = mid - 1;
            }
        }
        System.out.println(max);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(Long.parseLong(br.readLine()));
        }
        long min = Collections.max(list);

        search(1, min, list, n);
    }
}