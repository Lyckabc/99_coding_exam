package programmers.CT_algorithm.ExhaustiveSearch.P86491;

/**
 * Class: P86491
 *
 * @author lyckabc
 * @date 2024-07-15 17:18
 *       Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P86491 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };

        long startTime = System.nanoTime();
        System.out.println(sol.solution(sizes));

        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public int solution(int[][] sizes) {

        int minWidth = 0;
        int minHeight = 0;
        for (int[] size : sizes) {
            minWidth = Math.max(minWidth, Math.max(size[0], size[1]));
            minHeight = Math.max(minHeight, Math.min(size[0], size[1]));
        }
        return minWidth * minHeight;
    }
}