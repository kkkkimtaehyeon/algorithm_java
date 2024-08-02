import java.util.Map;
class Solution {
    public int solution(String s) {
        StringBuilder stacker = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> map = Map.of(
                "zero", 0,
                "one", 1,
                "two", 2,
                "three", 3,
                "four", 4,
                "five", 5,
                "six", 6,
                "seven", 7,
                "eight", 8,
                "nine", 9
        );

        for(int i = 0; i < s.length(); i++) {
            //숫자일떄는 그냥 추가
            try {
                String element = String.valueOf(s.charAt(i));
                int number = Integer.parseInt(element);
                answer.append(number);
            }
            catch(NumberFormatException e) {
                stacker.append(s.charAt(i));
                if(map.containsKey(stacker.toString())) {
                    answer.append(map.get(stacker.toString()));
                    stacker = new StringBuilder();
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }
}