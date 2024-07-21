package programmers.CT_foundation.day15.P181878;
/**
 * Class: P181878
 *
 * @author lyckabc
 * @date 2024-07-21 23:07
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181878 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "AbCdEfG";
        String pat = "aBc";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(myString, pat));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        if (myString.toLowerCase().contains(pat.toLowerCase())) {
            answer = 1;
        }
        return answer;
    }
}
/*
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.toLowerCase();
        String str2 = pat.toLowerCase();

        if (str.indexOf(str2) != -1) {
            return 1;
        }
        return 0;
    }
}
 */