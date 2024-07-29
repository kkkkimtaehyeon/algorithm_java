class Solution {
    public int collatz(long num) {
        if(num == 1 ) return 0;
        int count = 0;

        while (num != 1) {
            count += 1;

            if(count > 500) {
                return -1;
            }
            if(num % 2 == 0) {
                num = num / 2;
            }

            else {
                num = (num * 3) + 1;
            }
        }

        return count;
    }
    
    public int solution(int num) {
        
        int answer = collatz(num);
        return answer;
    }
}