/**
 * Class: P181924_exchange_idx
 *
 * @author lyckabc
 * @date 2024-07-14 17:57
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181924_exchange_idx {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0,1, 2, 3,4};
        int[][] queries = {{0, 3}, {1, 2},{1,4}};

        for (int num : sol.solution(arr, queries)) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {
            exchange(arr, query[0], query[1]);
        }
        return arr;
    }
    public void exchange(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}