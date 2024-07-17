class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.substring(0,s));
        String subStr = "";
        for (int i = e; i >= s; i--) {
            subStr += my_string.charAt(i);
        }
        answer.append(subStr);
        answer.append(my_string.substring(e + 1));
        return answer.toString();
    }
}