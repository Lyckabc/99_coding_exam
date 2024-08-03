class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x = Integer.MIN_VALUE;
        int y = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            x = Math.max(x, Math.abs(dots[0][0] - dots[i][0]));
            y = Math.max(y, Math.abs(dots[0][1] - dots[i][1]));
        }
        
        answer = Math.abs(x * y);
        return answer;
    }
}