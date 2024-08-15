package programmers.CT_basic.day22.P120876;
/**
 * Class: P120876
 *
 * @author lyckabc
 * @date 2024-08-15 17:54
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120876 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 1;
        int[] A = {1, 2, 3};
        String s = "abc";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(A));
        System.out.println(sol.solution(s));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        return answer;
    }
}