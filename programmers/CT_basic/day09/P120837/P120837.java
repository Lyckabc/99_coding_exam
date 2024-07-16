package programmers.CT_basic.day09.P120837;
/**
 * Class: P120837
 *
 * @author lyckabc
 * @date 2024-07-16 15:54
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120837 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int hp = 23;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(hp));

        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    private int[] divisor = {5, 3, 1};
    public int solution(int hp) {
        int answer = 0;
        for (int i = 0; i < divisor.length; i++) {
            answer += hp / divisor[i];
            hp %= divisor[i];
        }

        return answer;
    }
}
/* best solution
class Solution {
    public int solution(int hp) {
        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
    }
}

 */