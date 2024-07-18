package programmers.CT_basic.day10.P120843;

/**
 * Class: P120843
 *
 * @author lyckabc
 * @date 2024-07-18 17:05
 *       Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120843 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(numbers, k));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);
    }
}

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int lenN = numbers.length;
        answer = numbers[(2 * (k - 1)) % lenN];
        return answer;
    }
}
/* numbers는 오름차순으로 나열된 배열이므로, numbers[]에 값을 넣지 않아도 되는 문제였다.
class Solution {
    public int solution(int[] numbers, int k) {
        return (k-1)*2 % numbers.length+1;
    }
}
 */