package day13.P181892;
/**
 * Class: P181892
 *
 * @author lyckabc
 * @date 2024-07-19 17:36
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181892 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 2;

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(num_list, n)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);
        return answer;
    }
}
/*
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (n-1)];

        for(int i=n-1; i<num_list.length; i++) {
            answer[i - (n-1)] = num_list[i];     
        }

        return answer;
    }
}
 */