import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> wordRecord = new HashSet<>();
        int[] player = new int[n];
        

        for(int i = 1; i <= words.length; i++) {
            player[i%n]++;
            if (i > 1) {
                char before = words[i-2].charAt(words[i-2].length() - 1);
                if (words[i-1].charAt(0) != before) {
                    if (i%n == 0) {
                        return new int[]{n, player[0]};
                    }
                    return new int[]{i%n, player[i%n]};
                }
                if (words[i-2].charAt(words[i-2].length() - 1) != words[i-1].charAt(0)) {
                    return new int[]{i%n, player[i%n]};
                }
            }
            String word = words[i - 1];
            if (wordRecord.contains(word)) {
                if (i%n == 0) {
                    return new int[]{n, player[0]};
                }
                return new int[]{i%n, player[i%n]};
            }
            wordRecord.add(word);
        }
        return new int[]{0,0};
    }
}