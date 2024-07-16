package programmers.CT_basic.day07.P120826;
/**
 * Class: P120826
 *
 * @author lyckabc
 * @date 2024-07-15 22:58
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120826 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String my_string = "BCBdbe";
        String letter = "B";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string, letter));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;
    }
}