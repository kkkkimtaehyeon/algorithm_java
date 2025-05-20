import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int total = 0;
        int appleCount = 0;
        for(int i = score.length - 1; i >= 0; i--) {
            if (++appleCount  > m) {
                appleCount = 1;
            }
            if (appleCount == m) {
                total += score[i] * m;
            }
        }
        
        return total;
    }
}