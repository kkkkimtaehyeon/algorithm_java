import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answerCount = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        HashMap<String, Integer> S = new HashMap<>();

        for(int i = 0 ; i < n; i++){
            S.put(br.readLine(), 1);
        }

        for(int i = 0 ; i < m; i++){
            String userInput = br.readLine();

            if(S.get(userInput) != null){
                answerCount++;
            }
        }

        System.out.println(answerCount);
    }
}