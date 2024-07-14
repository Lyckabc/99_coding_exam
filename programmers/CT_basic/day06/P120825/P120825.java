package P120825;
/**
 * Class: P120825
 *
 * @author lyckabc
 * @date 2024-07-15 00:43
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120825 {
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
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            answer.append(String.valueOf(my_string.charAt(i)).repeat(n));
        }
        return answer.toString();
    }
}