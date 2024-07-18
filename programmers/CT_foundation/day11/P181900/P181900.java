package programmers.CT_foundation.day11.P181900;
/**
 * Class: P181900
 *
 * @author lyckabc
 * @date 2024-07-18 21:48
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181900 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        String my_string = "apporoograpemmemprs";

        long startTime = System.nanoTime();
        System.out.println(sol.solution(my_string, indices));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int lenI = indices.length;
        Arrays.sort(indices);
        for (int i = 0, j = 0; i < my_string.length(); i++) {
            if (j >= lenI || indices[j] != i) {
                answer += my_string.charAt(i);
            } else {
                j++;
            }
        }
        return answer;
    }
}
/*
class Solution {

    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] tmp = my_string.split("");

        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }

        for (String x : tmp) {
            answer += x;
        }
        return answer;
    }
}
 */
/*
class Solution {
    public String solution(String my_string, int[] indices) {
        String[] str = my_string.split("");
        for (int i=0;i<indices.length;i++) str[indices[i]] = "";
        return String.join("",str);
    }
}
 */