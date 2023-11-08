import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger inputNumber1 = new BigInteger(br.readLine());
        String cal = br.readLine();
        BigInteger inputNumber2 = new BigInteger(br.readLine());
        if(cal.equals("+")){
                System.out.println(inputNumber1.add(inputNumber2));
        }
        else{
            System.out.println(inputNumber1.multiply(inputNumber2));
        }
    }
}
