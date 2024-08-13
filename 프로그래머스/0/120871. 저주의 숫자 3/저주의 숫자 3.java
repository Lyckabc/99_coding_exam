class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer++;
            while (isContainThree(answer) || answer % 3 == 0) {
                answer++;
                }
        
        }
        return answer;
    }
    public boolean isContainThree(int n) {
        boolean contains = false;
        while (n > 10) {
            if (n % 10 == 3 || n / 10 == 3) return true;
            n /= 10;
        }
        return contains;
    }
}