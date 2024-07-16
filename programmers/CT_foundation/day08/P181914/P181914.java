package programmers.CT_foundation.day08.P181914;
/**
 * Class: P181914
 *
 * @author lyckabc
 * @date 2024-07-16 00:11
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181914 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String number = "78720646226947352489";


        long startTime = System.nanoTime();

        System.out.println(sol.solution(number));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] numbers = number.split("");
        for (String num : numbers) {
            answer += Integer.parseInt(num);
        }
        return answer % 9;
    }
}