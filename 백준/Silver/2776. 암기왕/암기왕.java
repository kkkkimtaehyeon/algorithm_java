import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int testCount = sc.nextInt();
        for (int test = 0; test < testCount; test++) {
            int note1Size = sc.nextInt();
            Set<Integer> note1 = new HashSet<>();
            for(int i = 0; i < note1Size; i++) {
                note1.add(sc.nextInt());
            }
            int note2Size = sc.nextInt();
            StringBuilder result = new StringBuilder();
            for(int i = 0; i < note2Size; i++) {
                int note2Number = sc.nextInt();
                if (note1.contains(note2Number)) {
                    result.append(1).append("\n");
                } else {
                    result.append(0).append("\n");
                }
            }
            System.out.print(result);
        }
    }
}