package programmers.CT_basic.day11.P120845;
/**
 * Class: P120845
 *
 * @author lyckabc
 * @date 2024-07-18 22:20
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120845 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] box = {10,6,8};
        int n = 3;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(box, n ));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for (int i = 0; i < box.length; i++) {
            answer *= box[i] / n;
        }
        return answer;
    }
}