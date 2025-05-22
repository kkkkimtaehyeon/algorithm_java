public class Main {
    public static void main(String args[]) {
        Solution solution = new Solution();
        solution.solution();
    }
}

class Solution {
    public void solution() {
        final int MAX = 10_000;
        boolean[] noSelfNumbers = new boolean[MAX + 1];
        for(int i = 1; i <= MAX; i++) {
            int dn = d(i);
            if (dn <= MAX) {
                noSelfNumbers[dn] = true;
            }
        }
        for(int i = 1; i <= MAX; i++) {
            if (!noSelfNumbers[i]) {
                System.out.println(i);
            }

        }
    }

    public int d(int n) {
        int result = n;
        String stringN = String.valueOf(n);
        for(Character c: stringN.toCharArray()) {
            result += Integer.parseInt(String.valueOf(c));
        }
        return result;
    }
}