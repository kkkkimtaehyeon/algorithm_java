import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int prevN = -1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int n: arr) {
            if(n != prevN) {
                list.add(n);
            }
            prevN = n;
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}