package programmers.CT_algorithm.sort.P42748;
/**
 * Class: P42748
 *
 * @author lyckabc
 * @date 2024-07-15 16:52
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P42748 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};


        long startTime = System.nanoTime();
        for (int num : sol.solution(array,commands)) {
            System.out.print(num + " ");
        }
        System.out.println();

        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int lenAnswer = commands.length;
        int[] answer = new int[lenAnswer];
        for (int i = 0; i < lenAnswer; i++) {
            int[] command = commands[i];
            int start = command[0] - 1;
            int end = command[1];
            int k = command[2] - 1;
            // answer[i] = Arrays.stream(array, start, end).sorted().toArray()[k];
            int[] subArray = Arrays.copyOfRange(array, start, end);
            Arrays.sort(subArray);
            answer[i] = subArray[k];
        }
        return answer;
    }
}