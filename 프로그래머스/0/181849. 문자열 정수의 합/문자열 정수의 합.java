class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            char c = num_str.charAt(i);
            if (Character.isDigit(c)) {
                int tmpNum = c - '0';
                answer += tmpNum;
            }
        }
        return answer;
    }
}