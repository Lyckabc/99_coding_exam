package programmers.CT_basic.day18.P120910;
/**
 * Class: P120910
 *
 * @author lyckabc
 * @date 2024-07-27 23:16
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120910 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 2;
        int t = 10;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(n,t));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; i++) {
            answer *= 2;
        }
        
        return answer;
    }
}
/*
class Solution {
    public int solution(int n, int t) {
        int answer = 0;

        answer = n << t;

        return answer;
    }
}
 */
/*
class Solution {
    public int solution(int n, int t) {
        int answer = n;

        for(int i=0; i<t; i++){
            answer = answer+answer; 
        }
        return answer;
    }
}
 */