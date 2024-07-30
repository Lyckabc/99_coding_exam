package programmers.CT_basic.day19.P120913;
/**
 * Class: P120913
 *
 * @author lyckabc
 * @date 2024-07-29 23:34
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P120913 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 6;
        String s = "abc1Addfggg4556b";

        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(sol.solution(s, a)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String[] solution(String my_str, int n) {
        int lenStr = my_str.length();
        int lenA = lenStr % n == 0 ? lenStr / n : (lenStr / n) + 1 ;
        String[] answer = new String[lenA];
        for (int i = 0 , j = 0; i < lenA; i++,j+=n) {
            if (n + j> lenStr) {
                answer[i] = my_str.substring(j);
                break;
            }
            answer[i] = my_str.substring(j, n + j);
        }
        return answer;
    }
}
/*
class Solution {
    public String[] solution(String my_str, int n) {
        int resultCnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[resultCnt];

        for (int i = 0; i < resultCnt; i++) {
            int start = n * i;
            int end = start + n >= my_str.length()? my_str.length(): start + n;
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}
 */