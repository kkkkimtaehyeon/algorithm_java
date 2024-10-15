class Solution {
    public int solution(int n) {
        int div = n / 7;
        if (n % 7 != 0) {
            div++;
        }
        return div;
    }
}