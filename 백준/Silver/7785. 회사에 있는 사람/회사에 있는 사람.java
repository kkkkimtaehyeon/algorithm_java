import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(br.readLine());
        String[] log;
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < n; i++){
            String input = br.readLine();
            log = input.split(" ");
            
            if(hashMap.get(log[0]) != null){
                hashMap.remove(log[0]);
            }
            else{
                hashMap.put(log[0],1);
            }
        }

        Set<String> keySet = hashMap.keySet();

        List<String> answer = new ArrayList<>();

        answer.addAll(keySet);

        answer.sort(Collections.reverseOrder());

        for(String ans : answer){
            System.out.println(ans);
        }

    }
}
