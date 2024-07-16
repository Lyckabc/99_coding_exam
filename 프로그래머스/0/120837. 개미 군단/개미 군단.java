class Solution {
    private int[] divisor = {5, 3, 1};
    public int solution(int hp) {
        int answer = 0;
        for (int i = 0; i < divisor.length; i++) {
            answer += hp / divisor[i];
            hp %= divisor[i];
        }

        return answer;
    }
}