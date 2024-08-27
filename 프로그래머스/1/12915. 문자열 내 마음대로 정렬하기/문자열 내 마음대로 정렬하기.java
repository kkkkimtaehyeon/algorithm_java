import java.util.Collections;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> list = new ArrayList<>();

        for(String element: strings) {
            list.add(element.charAt(n) + element);
        }

        Collections.sort(list);

        String[] result = new String[list.size()];

        for(int i = 0; i < result.length; i++) {
            result[i] = list.get(i).substring(1);
        }
        return result;
    }
}