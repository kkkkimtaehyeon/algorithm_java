import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] adjList;
    static boolean[] visited;
    static int[] parentNodes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        adjList = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        parentNodes = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            adjList[a].add(b);
            adjList[b].add(a);
        }
        dfs(1);
        for (int i = 2; i < parentNodes.length; i++) {
            System.out.println(parentNodes[i]);
        }
    }

    public static void dfs(int root) {
        visited[root] = true;

        for (int i = 0; i < adjList[root].size(); i++) {
            int next = adjList[root].get(i);
            if (!visited[next]) {
                parentNodes[next] = root;
                dfs(next);
            }
        }
    }
}
