import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (true) {
            line = br.readLine();
            if (line.equals(".")) {
                break;
            }

            Stack<Character> left = new Stack<>();
            boolean isValid = true;  // 유효성 검사용 플래그

            for (char ch : line.toCharArray()) {
                if (ch == '(' || ch == '[') {
                    left.push(ch);
                } else if (ch == ')') {
                    if (left.isEmpty() || left.peek() != '(') {
                        isValid = false;
                        break;
                    }
                    left.pop();
                } else if (ch == ']') {
                    if (left.isEmpty() || left.peek() != '[') {
                        isValid = false;
                        break;
                    }
                    left.pop();
                }
            }

            // 문자열을 모두 처리한 후 결과 출력
            if (isValid && left.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}