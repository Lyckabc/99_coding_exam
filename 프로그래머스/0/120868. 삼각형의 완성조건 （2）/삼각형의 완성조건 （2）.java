class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int minN = Math.min(sides[0],sides[1]);
        int maxN = Math.max(sides[0],sides[1]);
        for (int i = maxN - minN + 1 ; i < maxN + minN; i++) {
            answer++;
        }
        return answer;
    }
}