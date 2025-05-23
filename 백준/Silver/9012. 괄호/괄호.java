import java.util.*;

public class Main {
    public static void main(String args[]) {
        Solution solution = new Solution();
        solution.solution();
    }
}

class Solution {
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String vps = sc.nextLine();
            int count = 0;
            for(Character c: vps.toCharArray()) {
                if (c == '(') {
                    count++;
                } else {
                    count--;
                }
                if (count < 0) {
                    break;
                }
            }
            if (count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}