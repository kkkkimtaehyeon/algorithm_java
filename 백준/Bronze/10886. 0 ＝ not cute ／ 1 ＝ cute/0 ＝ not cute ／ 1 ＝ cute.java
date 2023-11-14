import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int trial = sc.nextInt();
        List<String> vote = new ArrayList<>();
        for(int i = 0; i < trial; i++){
            vote.add(sc.next());
        }
        int zero = (int)vote.stream().filter(num -> num.equals("0")).count();
        int one = (int)vote.stream().filter(num -> num.equals("1")).count();

        if(zero > one){
            System.out.println("Junhee is not cute!");
        }
        else{
            System.out.println("Junhee is cute!");
        }
    }
}
