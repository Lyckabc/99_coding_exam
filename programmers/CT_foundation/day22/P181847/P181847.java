package programmers.CT_foundation.day22.P181847;
/**
 * Class: P181847
 *
 * @author lyckabc
 * @date 2024-10-02 06:02
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181847 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "0010";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(s));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String n_str) {
        String answer = "";
        int idx = 0;
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) != '0') {
                idx = i;
                break;
            }
        }
        answer = n_str.substring(idx);
        return answer;
    }
}
/*
class Solution {
    public String solution(String n_str) {
        return ""+Integer.parseInt(n_str);
    }
}
 */