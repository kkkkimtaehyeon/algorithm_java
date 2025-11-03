import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        Set<Integer> sums = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();

        // 부분 수열의 길이를 1부터 n까지 늘려가며 계산
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                q.clear();

                // 원형으로 len개 요소를 큐에 추가하며 합산
                for (int i = 0; i < len; i++) {
                    int idx = (start + i) % n; // 원형 인덱스 처리
                    q.add(elements[idx]);
                    sum += elements[idx];
                }
                sums.add(sum);
            }
        }

        return sums.size();
    }
}
