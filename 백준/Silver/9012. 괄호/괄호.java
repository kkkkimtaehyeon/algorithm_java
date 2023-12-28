import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char open = '(';
        Stack<Character> stack = new Stack<>();
        String target = "";

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            boolean isFail = false;
            stack.clear();
            target = String.valueOf(br.readLine());
            for(int j = 0; j < target.length(); j++){
                try{
                    if(target.charAt(j) == open){
                        stack.push(open);
                    }
                    else{
                        stack.pop();
                    }
                }catch (EmptyStackException e){
                    System.out.println("NO");
                    isFail = true;
                    break;
                }
            }
            if(stack.empty() && !isFail){
                System.out.println("YES");
            }
            else if(!isFail){
                System.out.println("NO");
            }
        }


    }
}
