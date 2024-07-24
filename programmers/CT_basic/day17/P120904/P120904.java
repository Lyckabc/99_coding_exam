package programmers.CT_basic.day17.P120904;
/**
 * Class: P120904
 *
 * @author lyckabc
 * @date 2024-07-22 00:06
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P120904 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 29183;
        int k = 1;

        long startTime = System.nanoTime();
        System.out.println(sol.solution(num, k));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int power = 0;
        int tmp = num;
        int idx = 0;
        for (int i = 10; tmp > 0;) {
            if (tmp % i == k) {
                answer = idx;
            }
            tmp /= i;
            power++;
            idx++;
        }
        return answer == -1 ? answer : power - answer;
    }
}
/*
class Solution {
    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }
}
 */
/*
class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        int answer = numStr.indexOf(kStr);
        return answer < 0 ? -1 : answer + 1 ;
    }
}
 */
/* AI Solution
class Solution {
    public int solution(int num, int k) {
        String numStr = Integer.toString(num);
        int index = numStr.lastIndexOf(Integer.toString(k));
        return index == -1 ? -1 : numStr.length() - index;
    }
}
 */