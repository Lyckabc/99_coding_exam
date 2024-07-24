package programmers.CT_basic.day17.P120905;
/**
 * Class: P120905
 *
 * @author lyckabc
 * @date 2024-07-23 23:51
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P120905 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(sol.solution(n, numlist)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int n, int[] numlist) {
        String answerStr = "";
        for (int i = 0; i < numlist.length; i++) {
            int tmp = numlist[i];
            if (tmp % n == 0) {
                answerStr += tmp;
                answerStr += " ";
            }
        }
        String[] answerArr = answerStr.split(" ");
        int lenStr = answerArr.length;
        int[] answer = new int[lenStr];
        for (int i = 0; i < lenStr; i++) {
            answer[i] = answerArr[i];
        }
        return answer;
    }
}