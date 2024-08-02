package programmers.CT_basic.day20.P120860;
/**
 * Class: P120860
 *
 * @author lyckabc
 * @date 2024-08-02 03:44
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120860 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(dots));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x = Integer.MIN_VALUE;
        int y = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            x = Math.max(x, Math.abs(dots[0][0] - dots[i][0]));
            y = Math.max(y, Math.abs(dots[0][1] - dots[i][1]));
        }
        
        answer = Math.abs(x * y);
        return answer;
    }
}