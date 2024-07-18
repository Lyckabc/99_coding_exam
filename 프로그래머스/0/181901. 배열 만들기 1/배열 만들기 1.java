class Solution {
    public int[] solution(int n, int k) {
        int multiple = n / k;
        int[] answer = new int[multiple];
        for (int i = 1; i <= multiple; i++) {
            answer[i - 1] = i * k;
        }
        return answer;
    }
}