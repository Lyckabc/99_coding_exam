package programmers.CT_basic.day07.P120831;

/**
 * Class: P120831
 *
 * @author lyckabc
 * @date 2024-07-15 23:19
 *       Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120831 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(n));

        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
/* best solution
class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    }
} */