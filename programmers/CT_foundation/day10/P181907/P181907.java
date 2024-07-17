package programmers.CT_foundation.day10.P181907;
/**
 * Class: P181907
 *
 * @author lyckabc
 * @date 2024-07-17 22:41
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181907 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "ProgrammerS123";
        int n = 11;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string, n));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(0, n);
        return answer;
    }
}