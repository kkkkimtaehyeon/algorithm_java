import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int a : arr) {
            sb.append(a).append("\n");
        }

        System.out.println(sb.toString());
    }
}

class Man implements Comparable<Man> {
    int weight;
    int height;
    int rank;

    public Man(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Man o) {
        if (weight > o.weight && height > o.height) {
            return 1;
        } else if (weight < o.weight && height < o.height) {
            return -1;
        }
        return 0;
    }
}