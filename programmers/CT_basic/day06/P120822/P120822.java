package P120822;

/**
 * Class: P120822
 *
 * @author lyckabc
 * @date 2024-07-14 23:28
 *       Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120822 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String my_string = "jaron";
        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string));
        long endTime = System.nanoTime();
        System.out.printf("Original method duration: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder(my_string);
        return answer.reverse().toString();
        // 10배 차이남
        // String answer = "";
        // int lenStr = my_string.length();
        // for (int i = lenStr - 1; i >= 0; i--) {
        //     answer += my_string.charAt(i);
        // }
        // return answer;
    }
}