class Solution {
    public int solution(int n) {
        int answer = 0;
        while (Factorial(answer) <= n) {
            if (Factorial(answer + 1) > n) {
                return answer;
            }
            answer++;
        }
        return answer;
    }
    public int Factorial(int n) {
        if (n == 0) return 1;
        return n * (Factorial(n-1));
    }
}