class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1Idx = 0;
        int card2Idx = 0;
        for(String goalWord: goal) {
            if (card1Idx < cards1.length && cards1[card1Idx].equals(goalWord)) {
                card1Idx++;
            } else if (card2Idx < cards2.length && cards2[card2Idx].equals(goalWord)) {
                card2Idx++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}