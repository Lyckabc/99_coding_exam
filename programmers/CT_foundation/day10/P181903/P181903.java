package programmers.CT_foundation.day10.P181903;
/**
 * Class: P181903
 *
 * @author lyckabc
 * @date 2024-07-17 23:22
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181903 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int q = 3;
        int r = 1;
        String code = "qjnwezgrpirldywt";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(q, r, code));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer += code.charAt(i);
            }
        }
        return answer;
    }
}