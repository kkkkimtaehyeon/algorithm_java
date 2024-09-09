import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<String> set = new HashSet<>();
        int count = 0;


        for (int i = 0; i < s.length(); i++) {
            set.add(String.valueOf(s.charAt(i)));
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (j + i > s.length() - 1) {
                    break;
                }
                String ss = s.substring(j, (j + i) + 1);
                //System.out.println(ss);
                set.add(ss);

            }
        }

        System.out.println(set.size());
    }
}