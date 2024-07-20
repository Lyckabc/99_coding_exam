class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order);
        for (int i = 0; i < orderStr.length(); i++) {
            char c = orderStr.charAt(i);
            if (c == '3' || c == '6' || c == '9') {
                answer++;
            }
        }
        return answer;
    }
}