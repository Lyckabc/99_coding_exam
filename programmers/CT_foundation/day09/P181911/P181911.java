package programmers.CT_foundation.day09.P181911;
/**
 * Class: P181911
 *
 * @author lyckabc
 * @date 2024-07-16 12:24
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181911 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5},{7,7}};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_strings, parts));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            answer.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }
        return answer.toString();
    }
}