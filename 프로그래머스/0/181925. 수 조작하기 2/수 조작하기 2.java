import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        int lenNum = numLog.length;

        Map<Integer, Character> directionMap = new HashMap<>();
        directionMap.put(1, 'w');
        directionMap.put(-1, 's');
        directionMap.put(10, 'd');
        directionMap.put(-10, 'a');

        for (int i = 1; i < lenNum; i++) {
            int diff = numLog[i] - numLog[i - 1];
            Character direction = directionMap.get(diff);
            if (direction != null) {
                answer.append(direction);
            }
        }
        return answer.toString();
    }
}