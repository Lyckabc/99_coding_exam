package programmers.CT_foundation.day21.P181849;
/**
 * Class: P181849
 *
 * @author lyckabc
 * @date 2024-09-08 23:59
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181849 {
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
    public int solution(String num_str) {
        int answer = 0;
        return answer;
    }
}