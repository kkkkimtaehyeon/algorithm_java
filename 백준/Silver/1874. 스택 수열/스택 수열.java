import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String solution() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        int idx = 0;
        stack.push(idx++);
        int target;

        for (int i = 0; i < n; i++) {
            target = sc.nextInt();
            while (stack.peek() != target) {
                if (idx > n + 1) {
                    return "NO";
                }

                stack.push(idx++);
                sb.append("+\n");
            }
            stack.pop();
            sb.append("-\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution());

    }
}