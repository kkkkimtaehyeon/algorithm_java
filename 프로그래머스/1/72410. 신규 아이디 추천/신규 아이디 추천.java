import java.util.*;
class Solution {
    // 1단계
    public char toLowerCase(char c) {
        if (Character.isAlphabetic(c)) {
            if (Character.isUpperCase(c)) {
                return Character.toLowerCase(c);
            }
        }
        return c;
    }

    // 2단계
    public boolean validateCharacter(char c) {
        if (Character.isAlphabetic(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.') {
            return true;
        }
        return false;
    }

    // 3단계
    public void removeSerialDot(LinkedList<Character> list) {
        for(int i = 0; i < list.size(); i++) {
            while (list.get(i) == '.' && list.size() > i + 1 && list.get(i+1) == '.') {
                list.remove(i+1);
            }
        }
    }

    // 4단계
    public void trim(LinkedList<Character> list) {
        if (!list.isEmpty() && list.getFirst() == '.') {
            list.removeFirst();
        }
        if (!list.isEmpty() && list.getLast() == '.') {
            list.removeLast();
        }
    }

    // 5단계
    public void checkIsEmpty(LinkedList<Character> list) {
        if (list.isEmpty()) {
            list.add('a');
        }
    }


    // 6단계
    public void checkMaxLength(LinkedList<Character> list) {
        while(list.size() >= 16) {
            list.removeLast();
        }
        trim(list);
    }

    // 7단계
    public void checkMinLength(LinkedList<Character> list) {
        while(list.size() < 3) {
            list.add(list.getLast());
        }
    }

    public void checkLength(LinkedList<Character> list) {
        checkMaxLength(list);
        checkMinLength(list);
    }

    public String solution(String new_id) {
        StringBuilder sb = new StringBuilder();

        LinkedList<Character> list = new LinkedList<>();
        for(int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            // 1단계
            c = toLowerCase(c);
            // 2단계
            if (validateCharacter(c)) {
                list.add(c);
            }
        }

        // 3단계
        removeSerialDot(list);
        // 4단계
        trim(list);
        // 5단계
        checkIsEmpty(list);
        // 6단계
        checkMaxLength(list);
        // 7단계
        checkMinLength(list);

        for(char c: list) {
            sb.append(c);
        }
        return sb.toString();
    }

}