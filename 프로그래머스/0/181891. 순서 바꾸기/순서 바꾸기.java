import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int lenNumList = num_list.length;
        int[] preArr = Arrays.copyOfRange(num_list, 0, n);
        int[] postArr = Arrays.copyOfRange(num_list, n, lenNumList);
        int lenArr = preArr.length + postArr.length;
        int[] answer = new int[lenArr];
        for (int i = 0; i < lenArr; i++) {
            if (i < lenNumList - n) {
                answer[i] = postArr[i];
            } else {
                answer[i] = preArr[i - (lenNumList - n)];
            }
        }
        return answer;
    }
}
