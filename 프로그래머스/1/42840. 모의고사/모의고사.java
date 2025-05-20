import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<List<Integer>> students = new ArrayList<>();
        students.add(List.of(1, 2, 3, 4, 5));
        students.add(List.of(2, 1, 2, 3, 2, 4, 2, 5));
        students.add(List.of(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));
        
        int[] scoreBoard = new int[students.size()];
        
        int len = answers.length;
        for(int i = 0; i < len; i++) {
            int answer = answers[i];
            if (students.get(0).get(i%students.get(0).size()) == answer) {
                scoreBoard[0]++;
            }
            if (students.get(1).get(i%students.get(1).size()) == answer) {
                scoreBoard[1]++;
            }
            if (students.get(2).get(i%students.get(2).size()) == answer) {
                scoreBoard[2]++;
            }
        }
        
        return getMaxIndex(scoreBoard);
    }
    
    public int[] getMaxIndex(int[] arr) {
        int max = 0;
        for(int num: arr) {
            max = Math.max(max,num);
        }
        
        List<Integer> maxIndexList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                maxIndexList.add(i);
            }
        }
    
        Collections.sort(maxIndexList);
        
        int[] answer = new int[maxIndexList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = maxIndexList.get(i) + 1;
        }
        
        return answer;
    }
}