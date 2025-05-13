import java.util.*;

class Solution {
    public int solution(int k, int[] tangerines) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int t : tangerines) {
            countMap.put(t, countMap.getOrDefault(t, 0) + 1);
        }

        // 개수를 기준으로 내림차순 정렬
        List<Integer> counts = new ArrayList<>(countMap.values());
        counts.sort(Collections.reverseOrder());

        int answer = 0;
        for (int c : counts) {
            k -= c;
            answer++;
            if (k <= 0) break;
        }

        return answer;
    }
}
