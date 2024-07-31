import java.util.*;
class Solution {
    public String solution(String s) {
        char[] letters = s.toCharArray();
        int[] asciis = new int[letters.length];
        for(int i = 0; i < letters.length; i++) {
            asciis[i] = (int)letters[i];
        }

        Arrays.sort(asciis);

        for(int i = 0; i < asciis.length; i++) {
            letters[asciis.length - 1 - i] = (char)asciis[i];
        }

        String answer = "";
        for(char letter: letters) {
            answer += letter;
        }
        return answer;
    }
}