class Solution {
    public int solution(String[] babblings) {
        String[] possibleWords = new String[]{"aya", "ye", "woo", "ma"};
        String[] impossibleWords = new String[]{"ayaaya", "yeye", "woowoo", "mama"};
        
        
        boolean isPossible;
        int cantCount = 0;
        for(String babbling: babblings) {
            isPossible = true;
            for(String impossibleWord: impossibleWords) {
                if (babbling.contains(impossibleWord)) {
                    isPossible = false;
                    cantCount++;
                    break;
                }
            }
            if(isPossible) {
                for(String possibleWord: possibleWords) {
                    if (babbling.contains(possibleWord)) {
                        babbling = babbling.replaceAll(possibleWord, " ");    
                    }
                }
                if (!babbling.isBlank()) {
                    cantCount++;
                }
            }
        }
        return babblings.length - cantCount;
    }
}