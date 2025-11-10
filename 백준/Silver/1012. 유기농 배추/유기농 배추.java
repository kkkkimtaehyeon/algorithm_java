import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] g;
    static boolean[][] visited;
    static int[] dx = new int[]{1, 0, -1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};
    static int m; // 가로 x
    static int n; // 세로 y
    static int k; // 배추 심어진 위치 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            int warm = 0;
            g = new int[n][m];
            visited = new boolean[n][m];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                g[b][a] = 1;
            }

            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    if (g[y][x] == 1 && !visited[y][x]) {
                        warm++;
                        bfs(y, x);
                    }
                }
            }
            System.out.println(warm);
        }


    }

    static void bfs(int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y, x});
        visited[y][x] = true;

        while (!q.isEmpty()) {
            int[] yx = q.poll();
            y = yx[0];
            x = yx[1];

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny >= n || nx >= m || ny < 0 || nx < 0) continue;
                if (g[ny][nx] != 1 || visited[ny][nx]) continue;

                visited[ny][nx] = true;
                q.add(new int[]{ny, nx});
            }
        }
    }
}
