import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] result = new int[3];
        int[] btn = {300,60,10};
        int cnt;
        int num = sc.nextInt();

        for(int i = 0; i < 3; i++){
            cnt = 0;
            while(num >= btn[i]){
                num -= btn[i];
                cnt++;
            }
            result[i] = cnt;

        }

        if(num == 0){
            for(Integer i : result){
                System.out.printf("%d ",i);
            }
        }
        else{
            System.out.println(-1);
        }

    }
}
