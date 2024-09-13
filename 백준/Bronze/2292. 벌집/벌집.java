import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int idx = 1;
        int depth = 1;

        while (idx < n) {
            idx += (6 * depth++);
        }

        System.out.println(depth);

    }

}
