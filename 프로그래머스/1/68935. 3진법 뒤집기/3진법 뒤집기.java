import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n%3);
            n /= 3;
        }

        int answer = 0;
        int len = list.size();
        for(int i = 0; i < len; i++) {
            answer += (int) (list.get(i) * Math.pow(3, len - 1 - i));
        }
        return answer;
    }
}