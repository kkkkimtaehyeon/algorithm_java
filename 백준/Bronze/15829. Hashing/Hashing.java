import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String input = br.readLine();
        char[] inputArr = input.toCharArray();
        BigInteger sum = new BigInteger("0");

        for (int i = 0; i < len; i++) {
            BigInteger target = BigInteger.valueOf(inputArr[i] - 96).multiply(BigInteger.valueOf(31).pow(i));
            sum = sum.add(target);
        }

        System.out.println(sum.mod(BigInteger.valueOf(1234567891)));


    }
}