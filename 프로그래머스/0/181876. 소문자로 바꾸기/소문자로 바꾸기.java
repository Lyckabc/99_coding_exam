class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] charArr = myString.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            answer += Character.toLowerCase(charArr[i]);
        }
        return answer;
    }
}