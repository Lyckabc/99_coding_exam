import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int lenN = numbers.length;
        Arrays.sort(numbers);
        answer = numbers[lenN-1] * numbers[lenN-2];
        return answer;
    }
}