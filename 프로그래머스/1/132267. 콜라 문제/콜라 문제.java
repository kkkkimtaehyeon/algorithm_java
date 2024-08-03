class Solution {
    public int solution(int requiredBottles, int reward, int myBottles) {
        int count = 0;

        while(myBottles >= requiredBottles) {
            int rewardBottles = reward * (myBottles / requiredBottles);
            count += rewardBottles;
            int mod = myBottles % requiredBottles;
            myBottles = rewardBottles + mod;
        }
        return count;
    }
}