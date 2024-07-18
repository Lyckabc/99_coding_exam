class Solution {
    public int[][] solution(int[] num_list, int n) {
        int lenNumList = num_list.length;
        int row = lenNumList / n ;
        int[][] answer = new int[row][n];
        for (int i = 0; i < lenNumList; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        return answer;
    }
}