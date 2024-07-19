package programmers.CT_basic.day12.P120851;
/**
 * Class: P120851
 *
 * @author lyckabc
 * @date 2024-07-19 22:52
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120851 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "aAb1B2cC34oOp";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(s));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= '0' && c <= '9') {
                answer += c - '0';
            }
        }
        return answer;
    }
}
/*
class Solution {
    public int solution(String myString) {
        return myString
        .chars()
        .mapToObj(i -> (char) i)
        .filter(Character::isDigit)
        .map(String::valueOf)
        .mapToInt(Integer::valueOf)
        .sum();
    }
}
 */