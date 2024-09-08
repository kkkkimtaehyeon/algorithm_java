import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int movieCount = 0;
        int idx = 666;
        while(true) {
            String movieNumber = String.valueOf(idx);
            if (movieNumber.contains("666")) {
                movieCount++;
                if (movieCount == n) {
                    System.out.println(movieNumber);
                    break;
                }
            }
            idx++;
        }
    }
}
