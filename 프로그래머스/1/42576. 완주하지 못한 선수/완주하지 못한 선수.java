import java.util.*;

class Solution {
    public String solution(String[] participants, String[] completions) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String p: participants) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for(String c: completions) {
            if (map.get(c) != null) {
                map.put(c, map.get(c) - 1);
            }
        }
        
        for(String p: map.keySet()) {
            if (map.get(p) == null || map.get(p) !=0) {
                return p;
            }
        }
        return null;
        
    }
}