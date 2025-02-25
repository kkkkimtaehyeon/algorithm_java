class Solution {
    public int solution(int n) {
        int count = 0;
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum = i;
            for (int j = i+1; sum <= n; j++) {
                if (sum == n) {
                    count++;
                    break;
                }
                sum += j;
            }
        }
        return count;
    }
    
    
}