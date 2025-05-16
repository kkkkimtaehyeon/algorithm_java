import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map;
        boolean isOk;
        for(int i = 0 ; i <= discount.length - 10; i++) {
            map = new HashMap<>();
            isOk = true;
            for(int j = i; j < i + 10; j++) {
                map.merge(discount[j], 1, Integer::sum);
            }
            for(int x = 0; x < want.length; x++) {
                Integer temp = map.get(want[x]); 
                if (temp == null || temp != number[x]) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                answer++;
            }
        }
        return answer;
    }
}
