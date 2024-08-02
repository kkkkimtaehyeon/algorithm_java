import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int card = sc.nextInt();
            map.put(card, 1);
        }

        int m = sc.nextInt();
        int[] problems = new int[m];
        for(int i = 0; i < m; i++) {
            problems[i] = sc.nextInt();
        }

        int[] answer = new int[m];

        for(int i = 0; i < m; i++) {
            if(map.containsKey(problems[i])) {
                answer[i] = 1;
            }
        }

        for(int number: answer) {
            System.out.print(number + " ");
        }
    }
}