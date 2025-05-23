import java.util.*;
class Solution {
    final static Map<Character, Character> map = new HashMap<>();
    static {
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
    }

    public int solution(String vps) {
        int answer = 0;
        for(int x = 0; x < vps.length(); x++) {
            String rotatedVps = rotate(vps, x);
            if (isValidVps(rotatedVps)) {
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isValidVps(String vps) {
        Stack<Character> stack = new Stack<>();

        for(Character c: vps.toCharArray()) {
            if (isOpenParentheses(c)) {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && isMatch(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
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