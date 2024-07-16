class Solution {
    public String solution(String my_string, int n) {
        int lenStr = my_string.length();
        int start = lenStr - n;
        int end = lenStr;
        String answer = "";
        answer = my_string.substring(start, end);
        return answer;
    }
}