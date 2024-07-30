package programmers.CT_basic.day19.P120585;
/**
 * Class: P120585
 *
 * @author lyckabc
 * @date 2024-07-30 00:14
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120585 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 167;
        int[] A = {149, 180, 192, 170};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(A, a));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int h : array) {
            if (h > height) answer++;
        }
        return answer;
    }
}