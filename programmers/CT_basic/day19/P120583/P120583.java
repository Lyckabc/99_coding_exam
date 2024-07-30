package programmers.CT_basic.day19.P120583;
/**
 * Class: P120583
 *
 * @author lyckabc
 * @date 2024-07-30 00:12
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120583 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {1, 1, 2, 3, 4, 5};
        int a = 1;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(A, a));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer++;
            }
        }
        return answer;
    }
}