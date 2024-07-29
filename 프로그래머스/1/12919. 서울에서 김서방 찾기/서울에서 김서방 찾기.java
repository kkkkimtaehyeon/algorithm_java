class Solution {
    public String solution(String[] seoul) {
        String target = "Kim";
        String answer = "";
        for(int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals(target)) {
                answer = "김서방은 " + String.valueOf(i) + "에 있다";
            }
        }
        
        return answer;
    }
}