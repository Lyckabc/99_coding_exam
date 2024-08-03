import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            if (Character.isUpperCase(c)) {
                charArr[i] = Character.toLowerCase(c);
            }
        }
        Arrays.sort(charArr);
        for (char c : charArr) {
            answer += c;
        }
        return answer;
    }
}