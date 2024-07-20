import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sb.append(i).append(",");
            }
        }
        int[] answer = Arrays.stream(sb.toString().split(",")).mapToInt(Integer::parseInt).toArray();
        return answer;
    }
}