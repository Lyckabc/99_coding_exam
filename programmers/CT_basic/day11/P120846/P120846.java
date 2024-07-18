package programmers.CT_basic.day11.P120846;

/**
 * Class: P120846
 *
 * @author lyckabc
 * @date 2024-07-18 22:36
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;

public class P120846 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 50;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(n));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                answer++;
            } else if (i > 10 && (i % 5 == 0 || i % 7 == 0)) {
                answer++;
            }
        }
        return answer;
    }
}
/*
class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n < 4) return 0; // 4 미만의 수는 합성수가 없음

        for (int i = 4; i <= n; i++) {
            if (isComposite(i)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isComposite(int num) {
        if (num % 2 == 0) return true; // 짝수는 2를 제외하고 모두 합성수

        // 3부터 num의 제곱근까지 소수로 나누어 떨어지는지 확인
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return true;
        }
        return false;
    }
}
*/