package programmers.CT_basic.day13.P120853;
/**
 * Class: P120853
 *
 * @author lyckabc
 * @date 2024-07-19 23:22
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120853 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "-1 -2 -3 Z";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(s));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        int lenStr = str.length;
        int postInt = 0;
        for (int i = 0; i < lenStr; i++) {
            String c = str[i];
            if (c.equals("Z")) {
                answer -= postInt;
            } else {
                answer += Integer.parseInt(c);
                postInt = Integer.parseInt(c);
            }
        }
        return answer;
    }
}
/*
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}

 */