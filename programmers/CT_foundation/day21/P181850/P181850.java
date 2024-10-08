package programmers.CT_foundation.day21.P181850;
/**
 * Class:  P181850
 *
 * @author lyckabc
 * @date 2024-09-04 22:21
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class  P181850 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        double flo = 69.32;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(flo));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(double flo) {
        int answer = (int) Math.floor(flo);
        return answer;
    }
}
/*
class Solution {
    public int solution(double flo) {
        return (int) flo;
    }
}
 */