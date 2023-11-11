import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int trialNumber = Integer.parseInt(bf.readLine());
        List<Integer> row = new ArrayList<>();
        for(int i = 0; i < trialNumber; i++){
            row.add(Integer.parseInt(bf.readLine()));
        }
        row.sort(Comparator.naturalOrder());

        for(Integer number : row){
            System.out.println(number);
        }
    }
}
