class Solution {
    public long[] solution(int x, int n) {
        long sum = x;
        long[] answer = new long[n];
        for(int i = 0; i < n; i++){
            answer[i] = sum;
            sum += x;
        }
        return answer;
    }
}