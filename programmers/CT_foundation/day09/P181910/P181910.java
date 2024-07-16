package programmers.CT_foundation.day09.P181910;
/**
 * Class: P181910
 *
 * @author lyckabc
 * @date 2024-07-16 13:07
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181910 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "ProgrammerS123";
        int n = 11;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string, n));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String my_string, int n) {
        int lenStr = my_string.length();
        int start = lenStr - n;
        int end = lenStr;
        String answer = "";
        answer = my_string.substring(start, end);
        return answer;
    }
}
/*best solution
class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}
 */