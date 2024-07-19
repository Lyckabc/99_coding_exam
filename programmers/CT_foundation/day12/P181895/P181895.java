package day12.P181895;
/**
 * Class: P181895
 *
 * @author lyckabc
 * @date 2024-07-19 11:35
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class P181895 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(arr, intervals)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        for (int[] interval : intervals) {
            for (int i = interval[0]; i <= interval[1]; i++) {
                answer.add(arr[i]);
            }
        }   
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
/*
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        return Arrays.stream(intervals)
        .flatMapToInt(ints -> Arrays.stream(Arrays.copyOfRange(arr, ints[0], ints[1] + 1)))
        .toArray();
    }
}
 */
/*
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {

        int s1 = intervals[0][0], e1 = intervals[0][1], s2 = intervals[1][0], e2 = intervals[1][1], idx = 0;
        int[] answer = new int[e1 - s1 + e2 - s2 + 2];

        for (int i = s1; i <= e1; i++) {
            answer[idx++] = arr[i];
        }

        for (int i = s2; i <= e2; i++) {
            answer[idx++] = arr[i];
        }

        return answer;
    }
}
 */