import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set set = new Set();
        for (int i = 0; i < n; i++) {
            set.reader(br.readLine(), sb);
        }
        System.out.println(sb.toString());
    }
}

class Set {
    private boolean[] arr;

    public void reader(String input, StringBuilder sb) {
        String[] inputs = input.split(" ");
        String action = inputs[0];
        int value = 0;
        if (inputs.length == 2) {
            value = Integer.parseInt(inputs[1]);

            switch (action) {
                case "add":
                    add(value);
                    break;
                case "remove":
                    remove(value);
                    break;
                case "check":
                    sb.append(check(value)).append("\n");
                    break;
                case "toggle":
                    toggle(value);
                    break;
            }
        } else {
            switch (action) {
                case "all":
                    all();
                    break;
                case "empty":
                    empty();
                    break;
            }
        }
    }

    public Set() {
        arr = new boolean[21];
    }

    public void add(int x) {
        if (!arr[x]) {
            arr[x] = true;
        }
    }

    public void remove(int x) {
        if (arr[x]) {
            arr[x] = false;
        }
    }

    public int check(int x) {
        if (arr[x]) {
            return 1;
        }
        return 0;
    }

    public void toggle(int x) {
        if (arr[x]) {
            arr[x] = false;
        } else {
            arr[x] = true;
        }
    }

    public void all() {
        Arrays.fill(this.arr, true);
    }

    public void empty() {
        this.arr = new boolean[20];
    }
}