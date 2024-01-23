import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> rope = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            rope.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(rope, Collections.reverseOrder());

        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            answerList.add(i * rope.get(i-1));
        }

        System.out.println(Collections.max(answerList));




    }
}
