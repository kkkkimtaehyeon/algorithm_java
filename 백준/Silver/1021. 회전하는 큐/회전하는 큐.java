import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int count = 0;

        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        for (int target : targets) {
            count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == target) {
                    for (int j = 0; j < i; j++) {
                        list.add(list.remove(0));
                    }
                    list.remove(0);
                    break;
                } else if (list.get(list.size() - 1 - i) == target) {
                    for (int j = 0; j <= i; j++) {
                        list.add(0, (list.remove(list.size() - 1)));
                    }

                    count++;
                    list.remove(0);
                    break;
                } else {
                    count++;
                }
            }
            sum += count;
        }

        System.out.println(sum);

    }

}
