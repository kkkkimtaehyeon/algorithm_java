import java.util.ArrayList;
class Solution {
    public String solution(int[] food) {
        for(int i = 1; i < food.length; i++){//홀수인 음식->짝수로
            if(food[i] % 2 != 0){
                food[i]--;
            }
        }
        ArrayList<String> table = new ArrayList<>();

        for(int i = 1; i <= food.length-1; i++){
            for(int j = 0; j < food[i]/2; j++){
                table.add(String.valueOf(i));
            }
        }
        table.add("0");
        for(int i = 1; i <= food.length-1; i++) {
            for(int k = 0; k < food[food.length-i]/2; k++){
                table.add(String.valueOf(food.length-i));
            }
        }
        String answer = String.join("",table);
        return answer;
    }
}