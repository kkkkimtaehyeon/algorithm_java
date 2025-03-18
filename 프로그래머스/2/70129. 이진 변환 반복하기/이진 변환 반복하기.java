class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2]; // 0: 이진변환횟수, 1: 제거된 0의 개수
        
        trans(s, answer);
        return answer;
    }
    
    public void trans(String target, int[] answer) {
        if (target.equals("1")) {
            return;
        }
        
        int ogLen = target.length();
        target = removeZeros(target);
        int currentLen = target.length();
        answer[1] += (ogLen - currentLen);
        trans(toBinary(currentLen, answer), answer);       
    }
    
    private String removeZeros(String target) {
        return target.replace("0", "");
    }
    
    private String toBinary(int currentLen, int[] answer) {
        answer[0]++;
        return Integer.toBinaryString(currentLen);
    }
}