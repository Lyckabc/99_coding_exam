package day18.P181863;
/**
 * Class: P181863
 *
 * @author lyckabc
 * @date 2024-08-08 12:54
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181863 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String rny_string = "masterpiece";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(rny_string));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String rny_string) {
        String answer = "";
        answer = rny_string.replace("m", "rn");
        return answer;
    }
}