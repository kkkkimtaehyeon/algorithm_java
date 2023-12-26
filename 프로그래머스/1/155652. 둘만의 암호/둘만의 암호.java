import java.util.ArrayList;
class Solution {
    public String solution(String s, String skip, int index) {
        ArrayList<String> answer = new ArrayList<>();

        ArrayList<Character> alphabet = new ArrayList<>();
        for(int i = 97; i <= 122; i++){
            alphabet.add((char)i);
        }

        for(int i = 0; i < skip.length(); i++){
            char target = skip.charAt(i);
            alphabet.remove(alphabet.indexOf(target));
        }

        for(int i = 0; i < s.length(); i++){
            char target = s.charAt(i);
            int targetIndex = alphabet.indexOf(target) + index ;
            if(targetIndex >= alphabet.size()){
                targetIndex %= alphabet.size();
            }

            answer.add(String.valueOf(alphabet.get(targetIndex)));
        }

        
        return String.join("",answer);
    }
}