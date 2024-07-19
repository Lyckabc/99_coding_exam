class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int lenNumList = num_list.length;
        for (int i = 0; i < lenNumList; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}