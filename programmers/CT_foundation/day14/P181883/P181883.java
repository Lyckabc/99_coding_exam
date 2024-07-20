package programmers.CT_foundation.day14.P181883;
/**
 * Class: P181883
 *
 * @author lyckabc
 * @date 2024-07-20 23:27
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P181883 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {0, 1, 2, 3, 4};
        int[][] queries = {{0,1}, {1,2}, {2,3}};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(A, queries)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                answer[i] = answer[i] + 1; 
            }
        }
        return answer;
    }
}
/*
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for(int i=0; i<queries.length; i++){

            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                arr[j]++;
            }
        }

        return arr;
    }
}
 */