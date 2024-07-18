class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                answer++;
            } else if (i > 10 && (i % 5 == 0 || i % 7 == 0)) {
                answer++;
            }
        }
        return answer;
    }
}