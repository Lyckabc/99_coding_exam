package programmers.CT_basic.day16.P120898;
/**
 * Class: P120898
 *
 * @author lyckabc
 * @date 2024-07-21 23:11
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120898 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String message = "happy birthday!";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(message));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String message) {
        int answer = 0;
        for (int i = 0; i < message.length(); i++) {
            answer += 2;
        }
        return answer;
    }
}
/*
class Solution {
    public int solution(String message) {
        return message.length()*2;
    }
}
 */