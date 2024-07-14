class Solution {
    public int[] solution(int[] num_list) {
        int lenNum_list = num_list.length - 1;
        int[] answer = new int[lenNum_list + 1];
        for (int num : num_list) {
            answer[lenNum_list--] = num;
        }
        return answer;
    }
}