package programmers.CT_basic.day08.P120834;
/**
 * Class: P120834
 *
 * @author lyckabc
 * @date 2024-07-16 13:51
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120834 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int age = 23;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(age));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String ageStr = String.valueOf(age);
        for (int i = 0; i < ageStr.length() ; i++) {
            answer.append(Character.toString(ageStr.charAt(i) + 'a' - '0'));
        }
        return answer.toString();
    }
}
/*
best solution
class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();

        while(age > 0) {
            sb.insert(0, (char) ((age % 10) + (int)'a'));
            age /= 10;
        }

        return sb.toString();
    }
}
*/  