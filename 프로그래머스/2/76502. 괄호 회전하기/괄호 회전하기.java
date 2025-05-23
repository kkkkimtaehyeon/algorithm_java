import java.util.*;

class Solution {
    final static Map<Character, Character> map = new HashMap<>();

    public int solution(String vps) {
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');


        int answer = 0;
        for(int x = 0; x < vps.length(); x++) {
            String rotatedVps = rotate(vps, x);
            Stack<Character> stack = new Stack<>();
            boolean isFail = false;

            for(Character c: rotatedVps.toCharArray()) {
                if (isOpenParentheses(c)) {
                    stack.push(c);
                } else {
                    if (!stack.isEmpty() && isMatch(stack.peek(), c)) {
                        stack.pop();
                    } else {
                        isFail = true;
                        break;
                    }
                }
            }
            if (!isFail && stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }

    public String rotate(String vps, int x) {
        return vps.substring(x) + vps.substring(0, x);
    }

    public boolean isOpenParentheses(Character c) {
        return c == '(' || c == '{' || c == '[';
    }

    public boolean isMatch(Character open, Character close) {
        return map.get(open) == close;
    }
}