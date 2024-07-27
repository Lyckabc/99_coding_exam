package programmers.CT_basic.day18.P120909;
/**
 * Class: P120909
 *
 * @author lyckabc
 * @date 2024-07-25 20:41
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120909 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 144;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(a));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int n) {
        if (n <= 3) {
            if (n == 1){
                return 1;
            }
            return 2;
        }
        int sqrtNum = (int) Math.sqrt(n);
        
        if ( Math.pow(sqrtNum, 2) == n) {
            return 1;
        }else {
            return 2;
        }
    }
}
/*
class Solution {
    public int solution(int n) {
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
 */
/*
class Solution {
    public int solution(int n) {
        int answer = 0;
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}
 */