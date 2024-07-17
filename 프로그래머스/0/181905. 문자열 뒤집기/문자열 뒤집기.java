class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0,s);
        String subStr = "";
        for (int i = e; i >= s; i--) {
            subStr += my_string.charAt(i);
        }
        answer += subStr;
        answer += my_string.substring(e + 1);
        return answer;
    }
}