import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        a = a.concat(b);
        c = c.concat(d);
        Long result = Long.parseLong(a) + Long.parseLong(c);
        System.out.println(String.valueOf(result));

    }
}
