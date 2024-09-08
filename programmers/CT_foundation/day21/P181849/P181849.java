package programmers.CT_foundation.day21.P181849;
/**
 * Class: P181849
 *
 * @author lyckabc
 * @date 2024-09-08 23:59
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181849 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String num_str = "123456789";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(num_str));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            char c = num_str.charAt(i);
            if (Character.isDigit(c)) {
                int tmpNum = c - '0';
                answer += tmpNum;
            }
        }
        return answer;
    }
}
/*
class Solution {
    public int solution(String numStr) {
        return numStr.chars().map(c -> c - 48).sum();
    }
}
 */
/*
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] numArr= num_str.split("");
        for (String num : numArr){
            answer+=Integer.parseInt(num);
        }
        return answer;
    }
}
 */