package day07.P181922;
/**
 * Class: P181922
 *
 * @author lyckabc
 * @date 2024-07-15 00:48
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181922 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0,4,1},{0,3,2},{0,3,3}};

        long startTime = System.nanoTime();
        for (int num : sol.solution(arr,queries)){
            System.out.print(num+" ");
        }
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();

        for (int[] query : queries) {
            answer = query_calcul2(arr,answer, query[0], query[1], query[2]);
        }
        return answer;
    }
    public int[] query_calcul2(int[] arr, int[] answer, int idx1, int idx2,int multiNum) {

        for (int i = idx1; i <= idx2; i++) {
            if (i % multiNum == 0) {
                answer[i]++;
            }
        }

        return answer;
    }
}