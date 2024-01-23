import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int count = 0;
        int[] wallet = new int[n];

        for(int i = n-1; i >= 0; i--){
            wallet[i] = Integer.parseInt(br.readLine());
        }

        for(int coin : wallet){
            while(k >= coin){
                k -= coin;
                count++;
            }
        }

        System.out.println(count);




    }
}
