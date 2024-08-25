import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer> result = new ArrayList<>();

    public static void showMap(int[][] map) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void bfs(int[][] map, int[][] bugs) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[map.length][map[0].length];
        int[] temp;
        int count = 0;

        int[] dy = {-1, 1, 0 ,0};
        int[] dx = {0, 0, -1 ,1};

        for(int[] bug: bugs) {
            int bugX = bug[0];
            int bugY = bug[1];

            if(!visited[bugY][bugX]) {
                count++;

                queue.add(new int[]{bugY,bugX});
                visited[bugY][bugX] = true;
                map[bugY][bugX] = 2;

                while(!queue.isEmpty()) {
                    temp = queue.poll();
                    int y = temp[0];
                    int x = temp[1];

                    for(int i = 0; i < 4; i++) {
                        if(y+dy[i] >= 0 && y+dy[i] < map.length && x+dx[i] >= 0 && x+dx[i] < map[0].length) {
                            if (!visited[y+dy[i]][x+dx[i]] && map[y+dy[i]][x+dx[i]] == 1) {
                                visited[y+dy[i]][x+dx[i]] = true;
                                map[y+dy[i]][x+dx[i]] = 2;
                                queue.add(new int[]{y+dy[i], x+dx[i]});
                            }
                        }

                    }
                }
            }
        }
        result.add(count);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testCaseNumber = Integer.parseInt(br.readLine());



        int[][] map;
        int[][] bugs;

        for(int i = 0; i < testCaseNumber; i++) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            map = new int[col][row];
            bugs = new int[k][2];

            for(int j = 0; j < k; j++) {

                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());

                map[x][y] = 1;
                bugs[j] = new int[]{y, x};
            }
            bfs(map, bugs);

            //showMap(map);
        }

        for(int count: result) {
            System.out.println(count);
        }
    }
}
