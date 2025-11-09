import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static char[][] g;
    static boolean[][] visited;
    static int[] dx = new int[]{1, 0, -1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};
    static int houseComplex = 0;
    static int n;
    static List<Integer> houses = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        g = new char[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            g[i] = br.readLine().toCharArray();
        }

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (g[y][x] == '1' && !visited[y][x]) {
                    houses.add(1);
                    bfs(y, x);
                    houseComplex++;
                }
            }
        }
        System.out.println(houses.size());
        Collections.sort(houses);
        for (int houseCount : houses) {
            System.out.println(houseCount);
        }

    }

    static void bfs(int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y, x});
        visited[y][x] = true;
        int currentComplex = houses.size() - 1;

        while (!q.isEmpty()) {
            int[] yx = q.poll();
            y = yx[0];
            x = yx[1];
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny >= n || ny < 0 || nx >= n || nx < 0) continue;
                if (visited[ny][nx] || g[ny][nx] != '1') continue;
                visited[ny][nx] = true;
                q.add(new int[]{ny, nx});
                houses.set(currentComplex, houses.get(currentComplex) + 1);
            }
        }
    }
}
