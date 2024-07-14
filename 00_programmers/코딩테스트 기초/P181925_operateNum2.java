/**
 * Class: P181925_operateNum2
 *
 * @author lyckabc
 * @date 2024-07-14 17:02
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */

import java.util.HashMap;
import java.util.Map;

public class P181925_operateNum2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

        System.out.println(sol.solution(numLog));
    }
}
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