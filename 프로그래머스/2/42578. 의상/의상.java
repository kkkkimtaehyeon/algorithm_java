import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        // 종류별 개수 카운트
        for (String[] cloth : clothes) {
            String category = cloth[1];
            map.put(category, map.getOrDefault(category, 0) + 1);
        }
        
        int answer = 1;
        
        // 조합 계산
        for (int count : map.values()) {
            answer *= (count + 1);
        }
        
        return answer - 1;  // 모든 항목을 안 입는 경우 제외
    }
}
