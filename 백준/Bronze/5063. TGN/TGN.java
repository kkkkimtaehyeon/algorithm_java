import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ad = new int[n];
        for(int j = 0; j < n; j++){
            for(int i = 0; i < 3; i++){
                ad[i] = sc.nextInt();
            }
            if(ad[1]-ad[2] > ad[0]){
                System.out.print("advertise");
            }
            else if (ad[1]-ad[2] == ad[0]){
                System.out.print("does not matter");
            }
            else{
                System.out.print("do not advertise");
            }
            System.out.print("\n");
        }

    }
}
