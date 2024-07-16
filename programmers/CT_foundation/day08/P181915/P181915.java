package programmers.CT_foundation.day08.P181915;
/**
 * Class: P181915
 *
 * @author lyckabc
 * @date 2024-07-16 00:07
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181915 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String my_string = "cvsgiorszzzmrpaqpe";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string, index_list));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < index_list.length; i++) {
            answer.append(my_string.charAt(index_list[i]));
        }
        return answer.toString();
    }
}
/* best solution
class Solution {
    public String solution(String my_string, int[] index_list) {

        StringBuilder sb = new StringBuilder();

        for (int idx : index_list)
            sb.append(my_string.charAt(idx));

        return sb.toString();
    }
}
 */