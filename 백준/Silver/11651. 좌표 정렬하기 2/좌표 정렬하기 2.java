import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        Pos[] posArr = new Pos[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            posArr[i] = new Pos(x, y);
        }

        Arrays.sort(posArr);

        for (Pos pos : posArr) {
            System.out.println(pos);
        }


    }


}

class Pos implements Comparable<Pos> {
    int x;
    int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pos pos) {
        int comparison = this.y - pos.y;
        if (comparison == 0) {
            return this.x - pos.x;
        }
        return comparison;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}