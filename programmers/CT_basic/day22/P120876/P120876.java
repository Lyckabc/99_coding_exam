package programmers.CT_basic.day22.P120876;
/**
 * Class: P120876
 *
 * @author lyckabc
 * @date 2024-08-15 17:54
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P120876 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] lines = {{0,1},{2,5},{3,9}};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(lines));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] line : lines) {
            min = Math.min(min, Math.min(line[0], line[1]));
            max = Math.max(max, Math.max(line[0], line[1]));
        }
        int[] dp = new int[max - min + 1];

        for (int[] line : lines) {
            int start = line[0] - min;
            int end = line[1] - min;
            for (int i = start; i < end; i++) {
                dp[i]++;
            }
        }

        for (int count : dp) {
            if (count >= 2) {
                answer++;
            }
        }
        return answer;
    }
}
/*
import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] line : lines) {
            int from = Math.min(line[0], line[1]);
            int to = Math.max(line[0], line[1]);
            for (int i = from; i < to; i++) {
                map.merge(i, 1, Integer::sum);
            }
        }

        return (int) map.values().stream().filter(i -> i > 1).count();
    }
}
 */
/*
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        for (int i = -100; i < 100; i++) {
            int line = 0;
            if (lines[0][0]<=i && lines[0][1]>i) line++;
            if (lines[1][0]<=i && lines[1][1]>i) line++;
            if (lines[2][0]<=i && lines[2][1]>i) line++;

            if(line > 1) answer++;
        }

        return answer;
    }
}
 */
