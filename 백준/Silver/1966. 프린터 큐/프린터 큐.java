import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Doc {
    int priority;
    boolean isTarget;
    
    public Doc(int priority, boolean isTarget) {
        this.priority = priority;
        this.isTarget = isTarget;
    }
}


public class Main {

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int docAmount = sc.nextInt();
            int targetIndex = sc.nextInt();
            Queue<Doc> docs = new LinkedList<>();
            ArrayList<Integer> priorities = new ArrayList<>();

            for (int j = 0; j < docAmount; j++) {

                int priority = sc.nextInt();
                priorities.add(priority);

                if (j == targetIndex) {
                    docs.add(new Doc(priority, true));
                } else {
                    docs.add(new Doc(priority, false));
                }
            }

            int count = 0;
            priorities.sort(Collections.reverseOrder());

            for (int priority : priorities) {

                while (!docs.isEmpty() && docs.peek().priority != priority) {
                    docs.add(docs.poll());
                }

                if (!docs.isEmpty() && docs.peek().priority == priority) {
                    Doc doc = docs.poll();
                    count++;

                    if (doc.isTarget) {
                        System.out.println(count);
                        break;
                    }
                }


            }
        }
    }
}