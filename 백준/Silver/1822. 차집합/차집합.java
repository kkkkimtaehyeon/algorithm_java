import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int aSize = sc.nextInt();
        int bSize = sc.nextInt();
        Map<Integer, Boolean> aMap = new HashMap<>();
        Map<Integer, Boolean> bMap = new HashMap<>();

        int[] a = new int[aSize];
        int[] b = new int[bSize];

        for (int i = 0; i < aSize; i++) {
            a[i] = sc.nextInt();
            aMap.put(a[i], true);
        }
        for (int i = 0; i < bSize; i++) {
            b[i] = sc.nextInt();
            bMap.put(b[i], true);
        }

        List<Integer> result = new ArrayList<>();
        for (int i : a) {
            if (bMap.get(i) == null) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(result.size());
            Collections.sort(result);
            StringBuilder sb = new StringBuilder();
            for(int i: result) {
                sb.append(i).append(" ");
            }
            System.out.println(sb);
        }
    }
}