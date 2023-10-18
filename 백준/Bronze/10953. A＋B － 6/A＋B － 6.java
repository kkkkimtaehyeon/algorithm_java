import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum;
        int t = sc.nextInt();
        String a = sc.nextLine();
        for(int i=0; i < t; i++) {
            sum = 0;
            String str = sc.nextLine();
            String[] s = str.split(",");
            for(String num : s){
                sum += Integer.parseInt(num);
            }
            System.out.println(sum);
        }
    }
}
