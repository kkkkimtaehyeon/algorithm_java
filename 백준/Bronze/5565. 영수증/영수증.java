import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int price;
        for(int i = 0; i < 9; i++){
            sum -= sc.nextInt();
        }
        System.out.println(sum);

    }
}
