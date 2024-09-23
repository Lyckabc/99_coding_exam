class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] line : lines) {
            min = Math.min(min, Math.min(line[0], line[1]));
            max = Math.max(max, Math.max(line[0], line[1]));
        }
        int[] dp = new int[max - min + 1];

        for (int[] line : lines) {
            int start = line[0] - min;
            int end = line[1] - min;
            for (int i = start; i < end; i++) {
                dp[i]++;
            }
        }

        for (int count : dp) {
            if (count >= 2) {
                answer++;
            }
        }
        return answer;
    }
}