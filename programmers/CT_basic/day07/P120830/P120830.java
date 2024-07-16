package programmers.CT_basic.day07.P120830;
/**
 * Class: P120830
 *
 * @author lyckabc
 * @date 2024-07-15 23:13
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120830 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        int k = 3;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(n,k));
        System.out.println(sol.solution(s));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    private int lamb = 12000;
    private int drink = 2000;

    public int solution(int n, int k) {
        int answer = 0;
        int lambPrice = lamb * n;
        if (n >= 10) {
            k = k - n / 10;
        }
        int drinkPrice = drink * k;
        answer = lambPrice + drinkPrice;
        return answer;
    }
}