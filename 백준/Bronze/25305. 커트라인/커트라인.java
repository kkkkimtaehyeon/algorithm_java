import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0 ; i < n; i++){
            arr.add(sc.nextInt());
        }

        Collections.sort(arr,Collections.reverseOrder());

        System.out.println(arr.get(k-1));
    }
}