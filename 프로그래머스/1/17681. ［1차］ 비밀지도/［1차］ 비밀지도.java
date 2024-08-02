class Solution {
    public int[] convertToBinary(int num, int n) {
        int[] binary = new int[n];
        for(int i = n - 1; i >= 0; i--) {
            if(num == 0) {
                binary[i] = 0;
            }
            else {
                binary[i] = num % 2;
                num /= 2;
            }
        }
        return binary;
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];

        for(int i = 0; i < n; i++) {
            map1[i] = convertToBinary(arr1[i], n);
        }
        for(int i = 0; i < n; i++) {
            map2[i] = convertToBinary(arr2[i], n);
        }

        String[] result = new String[n];

        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++) {
                if(map1[i][j] == 1 || map2[i][j] == 1) {
                    sb.append("#");
                }
                else {
                    sb.append(" ");
                }
            }
            result[i] = sb.toString();
        }
        
        return result;
    }
}