package programmers.CT_foundation.day11.P181902;
/**
 * Class: P181902
 *
 * @author lyckabc
 * @date 2024-07-18 18:33
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181902 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "AAAaaaZZzz";

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(my_string)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    int[] alpha = new int[52];
    public int[] solution(String my_string) {
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alpha[c - 'a' + 26]++;
            }else if (c >= 'A' && c <= 'Z') {
                alpha[c - 'A']++;
            }
        }
        return alpha;
    }
}
/* AI Solution
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(char ch: my_string.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                answer[ch - 'A']++;
            } else if (Character.isLowerCase(ch)) {
                answer[ch - 'a' + 26]++;
            }
        }
        return answer;
    }
}
 */