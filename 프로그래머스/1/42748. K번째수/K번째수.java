import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int lenAnswer = commands.length;
        int[] answer = new int[lenAnswer];
        for (int i = 0; i < lenAnswer; i++) {
            int[] command = commands[i];
            int start = command[0] - 1;
            int end = command[1];
            int k = command[2] - 1;
            answer[i] = Arrays.stream(array, start, end).sorted().toArray()[k];
        }
        return answer;
    }
}