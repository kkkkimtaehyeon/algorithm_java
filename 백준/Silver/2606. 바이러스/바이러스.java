import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[] visited;
    static int answer = -1;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int computer = sc.nextInt();
        int related = sc.nextInt();

        arr = new int[computer+1][computer+1];
        visited = new boolean[computer+1];

        for(int i = 0; i < related; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a][b] = arr[b][a] = 1;
        }
        dfs(1);
        System.out.println(answer);

    }
    public static void dfs(int start) {
        visited[start] = true;
        answer++;

        for(int i = 0 ; i < arr.length; i++) {
            if(arr[start][i] == 1 && visited[i] == false) {
                dfs(i);
            }
        }
    }


}
