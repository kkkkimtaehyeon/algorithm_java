class Solution {
    public int solution(int n) {
        int nCount = countOne(n);
        int next = n;
        while(true) {
            if (isHavingSameOneCount(nCount, ++next)) {
                return next;
            }
        }
    }

    public boolean isHavingSameOneCount(int nCount, int next) {
        return nCount == countOne(next);
    }

    public int countOne(int n) {
        int count = 0;
        while(n > 0) {
            if (n % 2 != 0) {
                count++;
            }
            n /= 2;
        }
        return count;
    }
}