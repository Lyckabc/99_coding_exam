class Solution {
    public int[] solution(int[] num_list, int n) {
        int lenNumList = num_list.length;
        int[] answer = new int[lenNumList / n + (lenNumList % n == 0 ? 0 : 1)];
        for (int i = 0, j = 0; i < lenNumList; i+=n, j++) {
            answer[j] = num_list[i];
        }
        return answer;
    }
}