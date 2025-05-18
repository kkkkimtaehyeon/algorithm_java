import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int metal = 0;
        for(int knight = 1; knight <= number; knight++) {
            int divisorCount = 0;
            for(int i = 1; i <= Math.sqrt(knight); i++) {
                if (knight % i == 0) {
                    divisorCount++;
                    if (i != knight / i) {
                        divisorCount++; // i와 짝인 약수도 포함 (제곱수 예외 처리)
                    }
                }
            }
            if (divisorCount > limit) {
                metal += power;
            } else {
                metal += divisorCount;
            }
        }

        return metal;
    }
}