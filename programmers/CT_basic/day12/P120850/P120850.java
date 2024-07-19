package programmers.CT_basic.day12.P120850;
/**
 * Class: P120850
 *
 * @author lyckabc
 * @date 2024-07-19 22:39
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P120850 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "hi12392";

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(s)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[A-Z|a-z]", "");
        int[] answerInt = new int[answer.length()];
        for (int i = 0; i < answer.length(); i++) {
            answerInt[i] = answer.charAt(i) - '0';
        }
        Arrays.sort(answerInt);
        return answerInt;
    }
}
/*
import java.util.*;

class Solution {
    public int[] solution(String myString) {
        return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "")
        .split(""))
        .sorted()
        .mapToInt(Integer::parseInt)
        .toArray();
    }
}
 */