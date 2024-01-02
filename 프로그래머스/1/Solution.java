
import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        int ext_index = getTargetIndex(ext);
        int sort_index = getTargetIndex(sort_by);

        ArrayList<int[]> result = new ArrayList<>();

        for(int[] target : data){
            if(target[ext_index] < val_ext){
                result.add(target);
            }
        }
        Map<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i < result.size(); i++){
            hash.put(result.get(i)[sort_index],i);
        }
        List<Integer> keySet = new ArrayList<>(hash.keySet());
        Collections.sort(keySet);

        int[][] answer = new int[result.size()][4];
        for(int i = 0; i < answer.length; i++){
            answer[i] = result.get(hash.get(keySet.get(i)));
        }

        return answer;
    }
    private static int getTargetIndex(String ext){
        return switch (ext) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> throw new IllegalStateException("Unexpected value: " + ext);
        };
    }
}