class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        
        boolean isFirst = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                isFirst = true;
            } else if (isFirst) {
                sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
                isFirst = false;
            }
        }
        return sb.toString();
    }
}