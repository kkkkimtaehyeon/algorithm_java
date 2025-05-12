class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for(int[] wallet: sizes) {
            if (wallet[0] < wallet[1]) {
                int temp = wallet[0];
                wallet[0] = wallet[1];
                wallet[1] = temp;
            }
            if (wallet[0] > w) {
                w = wallet[0];
            }
            if (wallet[1] > h) {
                h = wallet[1];
            }
        }
        return h * w;
    }
}