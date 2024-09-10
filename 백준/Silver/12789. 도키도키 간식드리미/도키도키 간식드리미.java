import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        for (int i = 1; i <= n; i++) {
            while (true) {
                if (!queue.isEmpty() && queue.peek() == i) {
                    queue.poll();
                    break;
                } else if (!stack.isEmpty() && stack.peek() == i) {
                    stack.pop();
                    break;
                } else {
                    int polled = queue.poll();

                    if (!stack.isEmpty() && polled > stack.peek()) {
                        return false;
                    }

                    stack.add(polled);
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (solution()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }

    }
}