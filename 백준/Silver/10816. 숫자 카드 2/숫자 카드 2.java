import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<Integer,Integer> hash = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int inputNumber = Integer.parseInt(st.nextToken());
            if(hash.get(inputNumber) == null){
                hash.put(inputNumber,1);
            }
            else{
                hash.put(inputNumber,hash.get(inputNumber)+1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int inputNumber = Integer.parseInt(st.nextToken());

            if(hash.get(inputNumber) == null){
                sb.append(0).append(" ");
            }
            else{
                sb.append(hash.get(inputNumber)).append(" ");
            }
        }

        System.out.println(sb);
    }
}
