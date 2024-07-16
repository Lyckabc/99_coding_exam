package programmers.CT_basic.day07.P120829;
/**
 * Class: P120829
 *
 * @author lyckabc
 * @date 2024-07-15 23:05
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120829 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int angle = 70;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(angle));

        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (angle > 0 && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle > 90 && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }
        return answer;
    }
}