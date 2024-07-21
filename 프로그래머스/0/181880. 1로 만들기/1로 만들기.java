class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            answer += makeOne(num_list[i]);
        }
        return answer;
    }
    public int makeOne(int n) {
        int cnt = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
                cnt++;
            } else {
                n = (n - 1) / 2;
                cnt++;
            }
        }
        return cnt;
    }
}