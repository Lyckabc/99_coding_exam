package programmers.CT_basic.day20.P120862;
/**
 * Class: P120862
 *
 * @author lyckabc
 * @date 2024-08-06 04:30
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120862 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 2, -3, 4, -5};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(numbers));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] numbers) {
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int curNum = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (i == j) continue;
                int preNum = numbers[j];
                maxNum = Math.max(curNum * preNum, maxNum);
            }
        }
        return maxNum;
    }
}
/*
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
}
 */