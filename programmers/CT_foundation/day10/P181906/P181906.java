package programmers.CT_foundation.day10.P181906;
/**
 * Class: P181906
 *
 * @author lyckabc
 * @date 2024-07-17 22:44
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181906 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "banana";
        String is_prefix = "ban";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string, is_prefix));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.substring(0, i).equals(is_prefix)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}