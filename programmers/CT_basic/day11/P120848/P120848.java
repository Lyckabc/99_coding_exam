package programmers.CT_basic.day11.P120848;
/**
 * Class: P120848
 *
 * @author lyckabc
 * @date 2024-07-18 23:11
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120848 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 7;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(n));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        while (Factorial(answer) <= n) {
            answer++;
        }
        return answer - 1;
    }
    public int Factorial(int n) {
        if (n == 0) return 1;
        return n * (Factorial(n-1));
    }
}
/*
class Solution {
    public int solution(int n) {
        int fac = 1;
        int i = 0;

        while(true){
            if(fac <= n){
                fac *= i + 1;
                i++;
            }else break;
        }

        return i-1;
    }
}
 */