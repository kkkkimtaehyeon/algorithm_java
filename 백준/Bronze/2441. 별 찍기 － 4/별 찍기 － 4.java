import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = num; i >= 1; i--){
            for(int k = 0; k < num - i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}