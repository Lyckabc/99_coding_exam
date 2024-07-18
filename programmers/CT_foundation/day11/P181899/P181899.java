package programmers.CT_foundation.day11.P181899;

/**
 * Class: P181899
 *
 * @author lyckabc
 * @date 2024-07-18 22:07
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;

public class P181899 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int start_num = 10;
        int end_num = 3;

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(start_num, end_num)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        for (int i = start_num, j = 0; i >= end_num; i--, j++) {
            answer[j] = i;
        }
        return answer;
    }
}
/*
class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        for(int i=0; i<=start-end; i++) {
            answer[i] = start - i;
        }
        return answer;
    }
}
 */
/*
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
    }
}
 */
