import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        char[][] board = new char[y][x];
        for (int i = 0; i < y; i++) {
            String line = br.readLine();
            board[i] = line.toCharArray();
        }

        int minRepaints = Integer.MAX_VALUE;

        // 모든 8x8 서브보드 검사
        for (int dy = 0; dy <= y - 8; dy++) {
            for (int dx = 0; dx <= x - 8; dx++) {
                // 두 가지 시작 색상에 대한 변경 횟수 계산
                int repaintCountW = 0; // 시작이 'W'인 경우
                int repaintCountB = 0; // 시작이 'B'인 경우

                for (int i = dy; i < dy + 8; i++) {
                    for (int j = dx; j < dx + 8; j++) {
                        // 현재 위치가 짝수 합인지 홀수 합인지 판단
                        if ((i + j) % 2 == 0) {
                            if (board[i][j] != 'W') repaintCountW++;
                            if (board[i][j] != 'B') repaintCountB++;
                        } else {
                            if (board[i][j] != 'B') repaintCountW++;
                            if (board[i][j] != 'W') repaintCountB++;
                        }
                    }
                }

                // 최소 변경 횟수 업데이트
                int currentMin = Math.min(repaintCountW, repaintCountB);
                if (currentMin < minRepaints) {
                    minRepaints = currentMin;
                }

                // 만약 0이 나오면 더 이상 검사할 필요 없음
                if (minRepaints == 0) {
                    break;
                }
            }
            if (minRepaints == 0) {
                break;
            }
        }

        System.out.println(minRepaints);
    }
}