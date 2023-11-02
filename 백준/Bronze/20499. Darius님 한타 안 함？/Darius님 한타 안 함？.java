import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String kda = sc.nextLine();
        String[] KDA = kda.split("/");
        int k = Integer.parseInt(KDA[0]);
        int d = Integer.parseInt(KDA[1]);
        int a = Integer.parseInt(KDA[2]);

        if(k + a < d || d == 0){
            System.out.println("hasu");
        }
        else{
            System.out.println("gosu");
        }
    }
}
