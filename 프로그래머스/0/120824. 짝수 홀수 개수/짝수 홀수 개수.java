class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int evenN = 0;
        int oddN = 0;
        for (int i=0; i < num_list.length; i++) {
            int num = num_list[i];
            if (num % 2 == 0) {
                evenN++;
            } else {
                oddN++;
            }
        }
        answer[0] = evenN;
        answer[1] = oddN;
        return answer;
    }
}