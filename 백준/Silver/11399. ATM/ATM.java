import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> q = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            q.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(q);

        int answer = 0;

        for(int i = 0; i < q.size(); i++){
            int add = 0;
            for(int j = 0; j <= i; j++){
                add += q.get(j);
            }
            answer += add;
        }

        System.out.println(answer);
    }
}