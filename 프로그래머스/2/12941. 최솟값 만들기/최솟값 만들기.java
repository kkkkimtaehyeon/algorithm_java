import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {

        int min = A.length;
        if (A.length > B.length) {
            min = B.length;
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for (int i = 0; i < min; i++) {
            sum += (A[i] * B[B.length - 1 - i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 2};
        int[] b = {3, 4};
        System.out.println(solution.solution(a, b));
    }
}