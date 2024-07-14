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