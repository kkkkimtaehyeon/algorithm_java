import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        boolean[] arr = new boolean[right + 1]; // 소수가 아니면 true

        // 0과 1은 소수가 아님
        arr[0] = true;
        arr[1] = true;

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i * i <= right; i++) {
            if (!arr[i]) { // i가 소수인 경우
                for (int j = i * i; j <= right; j += i) {
                    arr[j] = true; // i의 배수는 소수가 아님
                }
            }
        }

        // left부터 right까지 소수 출력
        for (int i = left; i <= right; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}