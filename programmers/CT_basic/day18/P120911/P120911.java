package programmers.CT_basic.day18.P120911;

/**
 * Class: P120911
 *
 * @author lyckabc
 * @date 2024-07-27 23:21
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;

public class P120911 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "Bcad";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(s));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArr = my_string.toLowerCase().toCharArray();

        Arrays.sort(charArr);
        for (char c : charArr) {
            answer += c;
        }
        return answer;
    }
}
/*
import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
 */
/*
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        return Arrays.stream(myString.toLowerCase(Locale.ROOT).split("")).sorted().collect(Collectors.joining());
    }
}
 */