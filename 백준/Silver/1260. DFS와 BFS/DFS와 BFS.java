import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = 1;
        }

        dfs(v);
        System.out.println("");
        visited = new boolean[n + 1];
        bfs(v);

    }

    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i = 1; i < graph[v].length; i++) {
            if (graph[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        visited[v] = true;
        q.add(v);

        while (!q.isEmpty()) {
            v = q.poll();
            System.out.print(v + " ");
            for (int i = 1; i < graph[v].length; i++) {
                if (graph[v][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }

        }

    }
}
