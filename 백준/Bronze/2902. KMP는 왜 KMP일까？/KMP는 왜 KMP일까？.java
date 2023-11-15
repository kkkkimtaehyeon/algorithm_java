import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String algorithmInput = sc.next();
        String[] nameSet = algorithmInput.split("-");
        String[] answer = new String[nameSet.length];
        for(int i = 0; i< nameSet.length; i++){
            answer[i] = String.valueOf(nameSet[i].charAt(0));
        }
        for(String ans : answer){
            System.out.print(ans);
        }
    }
}
