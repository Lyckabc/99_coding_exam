package programmers.CT_basic.day11.P120847;
/**
 * Class: 120847
 *
 * @author lyckabc
 * @date 2024-07-18 23:08
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P120847 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {0, 31, 24, 10, 1, 9};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(numbers));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int lenN = numbers.length;
        Arrays.sort(numbers);
        answer = numbers[lenN-1] * numbers[lenN-2];
        return answer;
    }
}
/*
class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0];
        int prev = 0;
        for(int i=1; i<numbers.length; i++){
            if(max < numbers[i]){
                prev = max;
                max = numbers[i];
            }else if(prev < numbers[i]){
                prev = numbers[i];
            }
        }

        return prev*max;
    }
}
 */