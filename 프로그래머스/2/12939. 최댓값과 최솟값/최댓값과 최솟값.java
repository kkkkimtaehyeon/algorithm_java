import java.util.*;
class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int[] arr = new int[st.countTokens()];

        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        return arr[0] + " " + arr[arr.length - 1];
    }
}