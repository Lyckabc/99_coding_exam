/**
 * Class: P181923_exchange_idx2
 *
 * @author lyckabc
 * @date 2024-07-14 18:07
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181923_exchange_idx2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0,1, 2, 4,3};
        int[][] queries = {{0, 4,2}, {0,3,2},{0,2,2}};

        for (int num : sol.solution(arr, queries)) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;
        for (int[] query : queries) {
            answer[idx++] = query_calcul(arr, query[0], query[1], query[2]);
        }
        return answer;
    }
    public int query_calcul(int[] arr, int idx1, int idx2,int limitNum) {
        int minNum = Integer.MAX_VALUE;
        for (int i = idx1; i <= idx2; i++) {
            int tmp = arr[i];
            if (tmp > limitNum && tmp < minNum) {
                minNum = tmp;
                if (minNum == limitNum + 1) {
                    break;
                }
            }
        }
        if (minNum == Integer.MAX_VALUE) {
            return -1;
        }
        return minNum;
    }
}