import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        int count = 0;
        
        for(int num: nums) {
            if (hashMap.get(num) == null) {
                hashMap.put(num, true);
                count++;
                if (count == nums.length/2) {
                    break;
                }
            }
        }
        return count;
    }
}