package day18.P181866;
/**
 * Class: P181866
 *
 * @author lyckabc
 * @date 2024-08-08 11:10
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
import java.util.*;
public class P181866 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "axbxcxdx";

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(myString)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String[] solution(String myString) {
        String[] strArr = myString.split("x");
        int idx = 0;
        for (String s : strArr){
            if (!s.isEmpty()) idx++;
        }
        String[] answer = new String[idx];
        idx = 0;
        for (String s : strArr) {
            if (!s.isEmpty()) answer[idx++] = s;
        }
        Arrays.sort(answer);
        return answer;
    }
   
}
/*
class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
        .filter(s -> !s.isEmpty())
        .sorted()
        .toArray(String[]::new);
    }
}
 */
/*
class Solution {
    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x");
        int idx = 0, N = st.countTokens();
        String[] result = new String[N];
        for (int n = 0;n < N;n++)
            result[idx++] = st.nextToken();
        Arrays.sort(result);
        return result;
    }
}
 */