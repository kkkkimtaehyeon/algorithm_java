import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()) {
            stack.push(c);
        }

        int count = 0;
        char element;
        while(!stack.isEmpty()) {
            element = stack.pop();

            if(element == ')') {
                count++;
            } else {
                if (count == 0) {
                    return false;
                }
                count--;
            }
        }
        if (count != 0) {
            return false;
        }
        return true;
    }
}