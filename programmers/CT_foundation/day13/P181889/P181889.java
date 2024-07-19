package day13.P181889;
/**
 * Class: P181889
 *
 * @author lyckabc
 * @date 2024-07-19 22:20
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181889 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(num_list, n)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}
/*
import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};

        answer = Arrays.copyOfRange(num_list,0,n);

        return answer;
    }
}

 */