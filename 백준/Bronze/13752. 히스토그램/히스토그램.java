import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j = 0; j < n; j++){
            int a = sc.nextInt();
            for(int i = 0; i < a; i++){
                System.out.print('=');
            }
            System.out.print("\n");
        }

    }
}
