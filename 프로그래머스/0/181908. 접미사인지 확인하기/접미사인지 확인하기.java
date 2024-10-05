import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution solution = new Solution();
        System.out.println(solution.solution("banana", "ana"));
    }
}

class Solution {
    public int solution(String my_string, String is_suffix) {
        if (my_string.length() < is_suffix.length()) {
            return 0;
        }
        int my = my_string.length();
        int is = is_suffix.length();
        my_string = my_string.substring( my - is);
        if (!my_string.equals(is_suffix)) {
            return 0;
        }
        return 1;
    }
}