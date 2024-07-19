import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= '0' && c <= '9') {
                answer += c;
            }
        }
        int[] answerInt = new int[answer.length()];
        for (int i = 0; i < answer.length(); i++) {
            answerInt[i] = answer.charAt(i) - '0';
        }
        Arrays.sort(answerInt);
        return answerInt;
    }
}