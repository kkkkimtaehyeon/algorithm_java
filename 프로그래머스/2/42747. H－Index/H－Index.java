import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        // 내림차순 정렬
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;

        // citations[i]는 오름차순이므로 뒤에서부터 체크
        for (int i = 0; i < n; i++) {
            int cited = citations[n - 1 - i]; // 큰 값부터 확인
            int count = i + 1;                // 상위 count개

            if (cited >= count) {
                h = count;
            } else {
                break;
            }
        }

        return h;
    }
}
