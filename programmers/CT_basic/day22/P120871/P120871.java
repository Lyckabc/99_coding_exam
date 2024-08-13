package programmers.CT_basic.day22.P120871;
/**
 * Class: P120871
 *
 * @author lyckabc
 * @date 2024-08-13 13:02
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120871 {
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
            answer++;
            while (isContainThree(answer) || answer % 3 == 0) {
                answer++;
                }
        
        }
        return answer;
    }
    public boolean isContainThree(int n) {
        if (n % 3 == 0) return true;
        boolean contains = false;
        while (n > 10) {
            if (n % 10 == 3 || n / 10 == 3) return true;
            n /= 10;
        }
        return contains;
    }
}
/*
class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }

        return answer;
    }
}
 */