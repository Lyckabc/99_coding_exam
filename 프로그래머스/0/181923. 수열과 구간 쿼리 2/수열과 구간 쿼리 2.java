class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            answer[i] = query_calcul(arr, queries[i][0], queries[i][1], queries[i][2]);
        }
        return answer;
    }
    public int query_calcul(int[] arr, int idx1, int idx2,int limitNum) {
        int minNum = Integer.MAX_VALUE;
        for (int i = idx1; i <= idx2; i++) {
            int tmp = arr[i];
            if (tmp < minNum && tmp > limitNum) {
                minNum = tmp;
            }
        }
        if (minNum == Integer.MAX_VALUE) {
            return -1;
        }
        return minNum;
    }
}