class Solution {
    public int solution(int n) {
        int answer = 0;
        while (Factorial(answer) <= n) {
            answer++;
        }
        return answer - 1;
    }
    public int Factorial(int n) {
        if (n == 0) return 1;
        return n * (Factorial(n-1));
    }
}