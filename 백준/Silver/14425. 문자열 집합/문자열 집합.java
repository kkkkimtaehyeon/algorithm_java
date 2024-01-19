import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int answerCount = 0;

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<String, Integer> S = new HashMap<>();

        for(int i = 0 ; i < n; i++){
            S.put(sc.next(), 1);
        }

        for(int i = 0 ; i < m; i++){
            String userInput = sc.next();

            if(S.get(userInput) != null){
                answerCount++;
            }
        }

        System.out.println(answerCount);
    }
}