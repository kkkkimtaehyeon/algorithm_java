class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int x = i; x <= j; x++) {
            String numString = String.valueOf(x);
            
            if (numString.contains(String.valueOf(k))) {
                for (char c: numString.toCharArray()) {
                    if (String.valueOf(c).equals(String.valueOf(k))) {
                        answer++;
                    }

                }
                
            }
        }
        
        return answer;
    }
}