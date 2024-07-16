package programmers.CT_basic.day08.P120836;
/**
 * Class: P120836
 *
 * @author lyckabc
 * @date 2024-07-16 15:44
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120836 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 20;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(n));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int n) {
        int answer = getDivisorCount(n);
        return answer;
    }
    public int getDivisorCount(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count;
    }
}