
class Solution {
    public int[] solution(int n, int[] numlist) {
        String answerStr = "";
        for (int i = 0; i < numlist.length; i++) {
            int tmp = numlist[i];
            if (tmp % n == 0) {
                answerStr += tmp;
                answerStr += " ";
            }
        }
        if (answerStr.length() == 0) {
            return new int[0];
        }
        String[] answerArr = answerStr.split(" ");
        int lenStr = answerArr.length;
        int[] answer = new int[lenStr];
        for (int i = 0; i < lenStr; i++) {
            answer[i] = Integer.parseInt(answerArr[i]);
        }
        return answer;
    }
}