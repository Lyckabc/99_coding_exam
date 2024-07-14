class Solution {
    public String solution(String my_string) {
        String answer = "";
        int lenStr = my_string.length();
        for (int i = lenStr - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}