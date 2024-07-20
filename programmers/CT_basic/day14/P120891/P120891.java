package programmers.CT_basic.day14.P120891;
/**
 * Class: P120891
 *
 * @author lyckabc
 * @date 2024-07-20 21:52
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120891 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int order = 29423;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(order));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order);
        //String str = order+"";
        for (int i = 0; i < orderStr.length(); i++) {
            char c = orderStr.charAt(i);
            if (c == '3' || c == '6' || c == '9') {
                answer++;
            }
        }
        return answer;
    }
}
/*
import java.util.Arrays;

class Solution {
    public int solution(int order) {
        return (int) Arrays
        .stream(String.valueOf(order).split(""))
        .map(Integer::parseInt)
        .filter(i -> i == 3 || i == 6 || i == 9)
        .count();
    }
}
 */