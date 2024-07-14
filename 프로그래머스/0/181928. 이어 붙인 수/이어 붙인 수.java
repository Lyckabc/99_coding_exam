class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int evenNum = 0;
        int oddNum = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenNum *= 10;
                evenNum += num_list[i];
            } else {
                oddNum *= 10;
                oddNum += num_list[i];
            }
        }
        answer = evenNum + oddNum;
        return answer;
    }
}