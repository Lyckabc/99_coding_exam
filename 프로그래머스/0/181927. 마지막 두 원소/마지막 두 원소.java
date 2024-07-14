class Solution {
    public int[] solution(int[] num_list) {
        int lenNum = num_list.length;
        int[] answer = new int[lenNum +  1];
        for (int i = 0; i < lenNum; i++) {
            answer[i] = num_list[i];
        }
        if (num_list[lenNum - 1] > num_list[lenNum - 2]) {
            answer[lenNum] = num_list[lenNum - 1] - num_list[lenNum - 2];
        } else {
            answer[lenNum] = num_list[lenNum - 1] * 2;
        }
        return answer;
    }
}