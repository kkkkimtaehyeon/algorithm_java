import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] uni = {"Soongsil","Korea","Hanyang"};
        HashMap<Integer,String> a = new HashMap<>();
        int[] input = new int[3];
        for(int i = 0; i < 3; i++){
            input[i] = sc.nextInt();
        }
        for(int i = 0; i < 3; i++){
            a.put(input[i],uni[i]);
        }
        Arrays.sort(input);
        if(input[0]+input[1]+input[2] >= 100){
            System.out.println("OK");
        }
        else{
            System.out.println(a.get(input[0]));
        }
    }
}
