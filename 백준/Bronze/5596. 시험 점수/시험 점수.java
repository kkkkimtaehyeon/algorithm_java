import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        int sumA = 0;
        int[] b = new int[4];
        int sumB = 0;
        for(int i = 0; i < 4; i++){
            a[i] = sc.nextInt();
            sumA += a[i];
        }
        for(int i = 0; i < 4; i++){
            b[i] = sc.nextInt();
            sumB += b[i];
        }
        if(sumA >= sumB){
            System.out.println(sumA);
        }
        else{
            System.out.println(sumB);
        }
    }
}
