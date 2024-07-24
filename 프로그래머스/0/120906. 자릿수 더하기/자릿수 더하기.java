class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 10; n > 0;) {
            answer += n % i;
            n /= i;
        }
        return answer;
    }
}