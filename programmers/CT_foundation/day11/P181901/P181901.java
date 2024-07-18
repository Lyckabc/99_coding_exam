package programmers.CT_foundation.day11.P181901;

/**
 * Class: P181901
 *
 * @author lyckabc
 * @date 2024-07-18 21:43
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;

public class P181901 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        int k = 3;

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(n, k)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public int[] solution(int n, int k) {
        int multiple = n / k;
        int[] answer = new int[multiple];
        for (int i = 1; i <= multiple; i++) {
            answer[i - 1] = i * k;
        }
        return answer;
    }
}
/* AI Solution
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int k) {
        return IntStream.range(1, n / k + 1).map(i -> i * k).toArray();
    }
}
*/