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