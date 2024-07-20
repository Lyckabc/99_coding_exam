package programmers.CT_foundation.day14.P181884;
/**
 * Class: P181884
 *
 * @author lyckabc
 * @date 2024-07-20 23:23
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181884 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {34, 5, 71, 29, 100, 34};
        int n = 123;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(A, n));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int num : numbers) {
            answer += num;
            if (answer > n) {
                break;
            }
        }
        return answer;
    }
}
/*
class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for(int i = 0; answer <= n; i++) {
            answer += numbers[i];
        }

        return answer;
    }
}
 */
/*
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers, int n) {
        return Arrays.stream(numbers).reduce(0, (acc, i) -> n >= acc ? acc + i : acc);
    }
}
 */