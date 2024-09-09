package programmers.CT_foundation.day21.P181848;
/**
 * Class: P181848
 *
 * @author lyckabc
 * @date 2024-09-10 06:22
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181848 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String n_str = "8542";

        long startTime = System.nanoTime();

        System.out.println(sol.solution(n_str));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String n_str) {
        int answer = Integer.parseInt(n_str);

        return answer;
    }
}
/*
class Solution {
    public int solution(String n_str) {
        int answer = 0;
        for(int i=0; i<n_str.length(); i++){
            answer = answer * 10;
            answer += n_str.charAt(i)-48;
        }
        return answer;
    }
}

 */