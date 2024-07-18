class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int lenN = numbers.length;
        answer = numbers[(2 * (k - 1)) % lenN];
        return answer;
    }
}