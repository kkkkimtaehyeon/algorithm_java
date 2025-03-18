class Solution {
    public int solution(int n) {
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        int answer = fibo(n, memo);
        return answer;
    }
    
    public int fibo(int num, int[] memo) {
        if (num == 0) {
            return memo[0];
        }
        if (num == 1) {
            return memo[1];
        }
        
        if (memo[num] == 0) {
            memo[num] = (fibo(num - 1, memo) + fibo(num - 2, memo)) % 1234567;    
        }
        return memo[num];
    }
}