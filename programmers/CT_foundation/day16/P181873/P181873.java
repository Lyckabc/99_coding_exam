package programmers.CT_foundation.day16.P181873;
/**
 * Class: P181873
 *
 * @author lyckabc
 * @date 2024-07-25 10:47
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181873 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "programmers";
        String alp = "p";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(s, alp));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String my_string, String alp) {
        String answer = my_string;
        answer = answer.replace(alp, alp.toUpperCase());
        return answer;
    }
}
/*
class Solution {
    public String solution(String my_string, String alp) {
        return my_string.replace(alp, ((char) ( alp.charAt(0) - 32)) + "");
    }
}
 */