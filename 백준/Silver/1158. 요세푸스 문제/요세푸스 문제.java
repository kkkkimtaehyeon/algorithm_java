import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<Integer>();
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while(!queue.isEmpty()){
            for(int i = 1; i < k; i++){
                queue.offer(queue.poll());
            }
            answer.add(String.valueOf(queue.poll()));
        }

        System.out.println("<" + String.join(", ", answer) + ">");

    }
}
