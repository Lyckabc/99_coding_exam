class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int power = 0;
        int tmp = num;
        int idx = 0;
        for (int i = 10; tmp > 0;) {
            if (tmp % i == k) {
                answer = idx;
            }
            tmp /= i;
            power++;
            idx++;
        }
        return answer == -1 ? answer : power - answer;
    }
}