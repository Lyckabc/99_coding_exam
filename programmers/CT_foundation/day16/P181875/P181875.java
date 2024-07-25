package programmers.CT_foundation.day16.P181875;
/**
 * Class: P181875
 *
 * @author lyckabc
 * @date 2024-07-25 10:36
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181875 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strArr = {"AAA","BBB","CCC","DDD"};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(strArr)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String[] solution(String[] strArr) {
        int lenArr = strArr.length;
        String[] answer = new String[lenArr];
        for (int i = 0; i < lenArr; i++) {
            String str = strArr[i];
            if (i % 2 == 0) {
                answer[i] = str.toLowerCase();
            } else {
                answer[i] = str.toUpperCase();
            }
        }
        return answer;
    }
}
/*
import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] strArr) {
        return IntStream
        .range(0, strArr.length)
        .mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
        .toArray(String[]::new);
    }
}
 */
/*
class Solution {
    public String[] solution(String[] strArr) {
        for(int i = 0; i < strArr.length; i++) {
            strArr[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        return strArr;
    }
}
 */