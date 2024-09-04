import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int bestArr() {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        Arrays.sort(arr);

        int left = 0;
        int right = 0;

        for(int i = 0; i < len; i++) {
            if (arr[i] == n) {
                return 0;
            }
            else if (arr[i] > n) {
                right = arr[i];
                if (i == 0) {
                    left = 0;
                }
                else {
                    left = arr[i-1];
                }
                break;
            }
        }

        int sum = 0;
        
        for(int i = left + 1; i <= n; i++) {
            for(int j = n; j < right; j++) {
                if (i == j) {
                    continue;
                }
                sum++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(bestArr());
        
    }
}