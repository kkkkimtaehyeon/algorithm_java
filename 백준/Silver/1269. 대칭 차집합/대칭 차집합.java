import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int aSize = sc.nextInt();
        int bSize = sc.nextInt();
        
        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < aSize; i++) {
            hashSet.add(sc.nextInt());
        }
        for(int i = 0; i < bSize; i++) {
            hashSet.add(sc.nextInt());
        }

        int totalSize = aSize + bSize;
        int least = totalSize - hashSet.size();
        System.out.println(hashSet.size() - least);

    }
}
