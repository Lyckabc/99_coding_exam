package programmers.CT_algorithm.ExhaustiveSearch.P86971;
/**
 * Class: P86971
 *
 * @author lyckabc
 * @date 2024-07-20 00:18
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P86971 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 9;
        int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(n, wires));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int n, int[][] wires) {
        int answer = -1;
        return answer;
    }
}