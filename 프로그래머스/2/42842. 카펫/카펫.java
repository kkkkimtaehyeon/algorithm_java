class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        for (int x = 3; x <= total/x; x++) {
            if (total % x == 0) {
                int y = total/x;
                if ((x-2) * (y-2) == yellow) {
                    return new int[]{Math.max(x, y), Math.min(x, y)};    
                }
                
            }
        }
        return new int[]{};
    }
}