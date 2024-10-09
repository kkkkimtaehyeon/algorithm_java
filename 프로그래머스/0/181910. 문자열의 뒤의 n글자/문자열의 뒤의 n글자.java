class Solution {
    public String solution(String my_string, int n) {
        int indexFrom = my_string.length() - n;
        String answer = my_string.substring(indexFrom);
        return answer;
    }
}