package programmers.CT_foundation.day16.P181877;
/**
 * Class: P181877
 *
 * @author lyckabc
 * @date 2024-07-25 10:28
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181877 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "aBcDeFg";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(s));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] charArr = myString.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            answer += Character.toUpperCase(charArr[i]);
        }
        return answer;
    }
}
/*

 */