class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int lenQueries = queries.length;

        for (int i = 0; i < lenQueries; i++) {
            exchange(arr, queries[i][0], queries[i][1]);
        }
        return arr;
    }
    public void exchange(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}