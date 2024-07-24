package programmers.CT_basic.day17.P120906;
/**
 * Class: P120906
 *
 * @author lyckabc
 * @date 2024-07-25 00:07
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120906 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 1234;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(a));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 10; n > 0;) {
            answer += n % i;
            n /= i;
        }
        return answer;
    }
}