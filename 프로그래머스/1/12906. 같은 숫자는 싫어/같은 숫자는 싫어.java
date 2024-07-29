import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int n: arr) {
            if (stack.isEmpty() || n != stack.peek()){
                stack.push(n);
            }
        }
        
        return stack;
    }
}