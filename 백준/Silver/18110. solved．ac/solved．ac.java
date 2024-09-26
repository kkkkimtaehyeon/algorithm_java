import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] evaluation = new int[n];

        for (int i = 0; i < n; i++) {
            evaluation[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(evaluation);

        double reduceTotal = evaluation.length * 0.3;
        int reduceEach = (int) Math.round(reduceTotal / 2);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = reduceEach; i < n - reduceEach; i++) {
            list.add(evaluation[i]);
        }


        float sum = list.stream().mapToInt(Integer::intValue).sum();
        int difficulty = Math.round(sum / list.size());
        System.out.println(difficulty);

    }
}