import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static int[][] bfs(int[][] map, int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        int[] vertex;
        int[][] route = new int[map.length][map[0].length];
        boolean[][] visited = new boolean[map.length][map[0].length];

        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        while(!queue.isEmpty()) {
            vertex = queue.poll();
            int y = vertex[0];
            int x = vertex[1];

            for(int i = 0; i < 4; i++) {
                if (y+dy[i] >= 0 && y+dy[i] < map.length && x+dx[i] >= 0 && x+dx[i] < map[0].length) {
                    if (!visited[y+dy[i]][x+dx[i]] && map[y+dy[i]][x+dx[i]] != 0) {
                        visited[y+dy[i]][x+dx[i]] = true;
                        queue.add(new int[]{y+dy[i], x+dx[i]});
                        route[y+dy[i]][x+dx[i]] = route[y][x] + 1;
                    }
                }
            }
        }
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    route[i][j] = -1;
                }
            }
        }

        return route;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        int startX = 0;
        int startY = 0;


        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    startX = i;
                    startY = j;
                }

            }
        }

        int[][] route = bfs(map, startX, startY);

        for(int[] col: route) {
            for(int row: col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

    }
}
