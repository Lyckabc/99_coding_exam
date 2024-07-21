class Solution {
    public int solution(int[] num_list) {
        int lenNumList = num_list.length;
        int answer;
        if (lenNumList >= 11) {
            answer = 0;
        } else {
            answer =1;
        }
        for (int i = 0; i < lenNumList; i++) {
            int tmpNum = num_list[i];
            if (lenNumList >= 11) {
                answer += tmpNum;
            } else {
                answer *= tmpNum;
            }
        }
        return answer;
    }
}