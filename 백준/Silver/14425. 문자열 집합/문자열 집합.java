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

        String numberInput = br.readLine();
        String[] number = numberInput.split(" ");


        HashMap<String, Integer> S = new HashMap<>();

        for(int i = 0 ; i < Integer.parseInt(number[0]); i++){
            S.put(br.readLine(), 1);
        }

        for(int i = 0 ; i < Integer.parseInt(number[1]); i++){
            String userInput = br.readLine();

            if(S.get(userInput) != null){
                answerCount++;
            }
        }

        System.out.println(answerCount);
    }
}