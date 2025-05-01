import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int treeCount = sc.nextInt();
        int required = sc.nextInt();

        int[] trees = new int[treeCount];
        int max = 0;
        for (int i = 0; i < treeCount; i++) {
            trees[i] = sc.nextInt();
            if (max < trees[i]) {
                max = trees[i];
            }
        }

        int result = Main.binSearch(trees, max, required);
        System.out.println(result);
    }

    public static int binSearch(int[] trees, int max, int target) {
        int lo = 0;
        int hi = max;
        int result = 0;

        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            long sum = 0;
            for (int treeHeight : trees) {
                if (treeHeight - mid > 0) {
                    sum += (treeHeight - mid);
                }
            }

            if (sum >= target) {
                result = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }

        }
        return result;
    }


}