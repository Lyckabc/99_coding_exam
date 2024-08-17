package programmers.CT_foundation.day20.P181854;
/**
 * Class: P181854
 *
 * @author lyckabc
 * @date 2024-08-17 23:49
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181854 {
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
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        return answer;
    }
}