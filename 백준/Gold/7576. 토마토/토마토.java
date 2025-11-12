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
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        g = new int[n][m];
        visited = new boolean[n][m];

        List<int[]> locations = new ArrayList<>();
        for (int y = 0; y < n; y++) {
            st = new StringTokenizer(br.readLine());
            int x = 0;
            while(st.hasMoreTokens()) {
                g[y][x] = Integer.parseInt(st.nextToken());
                if (g[y][x] == 1) {
                    locations.add(new int[]{y,x});
                }
                x++;
            }
        }

        System.out.println(bfs(locations));

    }

    static int bfs(List<int[]> locations) {
        Queue<int[]> q = new LinkedList<>();
        for (int[] loc: locations) {
            q.add(loc);
            visited[loc[0]][loc[1]] = true;
        }

        int day = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int j = 0; j < size; j++) {
                int[] yx = q.poll();
                int y = yx[0];
                int x = yx[1];

                for (int i = 0; i < 4; i++) {
                    int ny = y + dy[i];
                    int nx = x + dx[i];

                    if (ny >= n || nx >= m || ny < 0 || nx < 0) continue;
                    if (g[ny][nx] != 0 || visited[ny][nx]) continue;

                    visited[ny][nx] = true;
                    q.add(new int[]{ny, nx});
                    g[ny][nx] = 1; // 토마토 익히기
                }
            }
            day++;
        }

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < m; x++) {
                if (g[y][x] == 0) return -1;
            }
        }

        return day - 1;
    }
}
