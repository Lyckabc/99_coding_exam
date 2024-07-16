package programmers.CT_foundation.day09.P181912;
/**
 * Class: P181912
 *
 * @author lyckabc
 * @date 2024-07-16 12:24
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.ArrayList;
public class P181912 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] intStrs = {"0123456789", "9876543210", "9999999999"};
        int k = 50000, s = 5, l = 5;

        long startTime = System.nanoTime();
        for (int num : sol.solution(intStrs, k, s, l)) {
            System.out.print(num + " ");
        }
        System.out.println();
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            int tmpNum = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (tmpNum > k) {
                answer.add(tmpNum);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
/* best solution
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs).mapToInt(value -> Integer.parseInt(value.substring(s, s + l))).filter(value -> value > k).toArray();
    }
}
 */