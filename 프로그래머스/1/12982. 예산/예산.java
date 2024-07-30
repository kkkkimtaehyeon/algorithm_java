import java.util.*;
class Solution {
    public int solution(int[] arr, int budget) {
        
        int count = 0;
        
        Arrays.sort(arr);

        for(int number: arr) {
            if (budget >= number) {
                budget -= number;
                count++;
            }
        }
        
        return count;
    }
}