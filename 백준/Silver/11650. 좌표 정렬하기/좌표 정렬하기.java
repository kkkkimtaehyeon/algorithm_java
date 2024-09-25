import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Pos> list = new ArrayList<>();
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list.add(new Pos(x, y));
        }

        Collections.sort(list);

        for (int i = 0; i < n; i++) {
            Pos pos = list.get(i);
            System.out.println(pos.x + " " + pos.y);
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
    public int compareTo(Pos o1) {
        int comparison = this.x - o1.x;
        if (comparison == 0) {
            return this.y - o1.y;
        }
        return comparison;
    }
}