import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String solution(Stack<Integer> stack, int[] arr, int n) {
        StringBuilder sb = new StringBuilder();
        int idx = 1;

        for (int target : arr) {
            if (stack.isEmpty()) {
                stack.push(idx++);
                sb.append("+\n");

            }
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        System.out.println(solution(stack, arr, n));

    }
}