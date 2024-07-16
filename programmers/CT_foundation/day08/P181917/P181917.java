package programmers.CT_foundation.day08.P181917;
/**
 * Class: P181917
 *
 * @author lyckabc
 * @date 2024-07-15 23:23
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181917 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        boolean x1 = true;
        boolean x2 = false;
        boolean x3 = false;
        boolean x4 = false;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(x1, x2, x3, x4));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean A = false;
        boolean B = false;

        if (x1 || x2) {
            A = true;
        } 
        if (x3 || x4) {
            B = true;
        } 
        if (A && B) {
            answer = true;
        }
        return answer;
    }
}
/* best answer
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1||x2)&&(x3||x4);
        return answer;
    }
}

 */