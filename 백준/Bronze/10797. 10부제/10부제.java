import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] cars = new int[5];
        int a = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < 5; i++){
            cars[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++){
            if(cars[i] == a){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
