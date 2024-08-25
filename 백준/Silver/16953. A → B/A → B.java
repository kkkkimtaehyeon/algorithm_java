import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static long finder(long start, long target) {

        Queue<long[]> queue = new LinkedList<>();
        queue.add(new long[]{start, 1});

        while(!queue.isEmpty()) {
            long[] current = queue.poll();
            long temp = current[0];
            long depth = current[1];

            if (temp == target) {
                return depth;
            }

            // 다음 단계로 이동
            if(temp * 2 <= target) {
                queue.add(new long[]{temp * 2, depth + 1});
            }
            if(Long.parseLong(temp + "1") <= target) {
                queue.add(new long[]{Long.parseLong(temp + "1"), depth + 1});
            }
        }
        return -1; // 목표 값에 도달할 수 없는 경우
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        long target = sc.nextInt();

        long result = finder(start, target);
        System.out.println(result);

    }
}
