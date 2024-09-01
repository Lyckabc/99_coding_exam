package programmers.CT_foundation.day21.P181852;
/**
 * Class: P181852
 *
 * @author lyckabc
 * @date 2024-09-01 15:37
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.*;
public class P181852 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        /* 정수로 이루어진 리스트 num_list가 주어집니다. 
        num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
        입출력 예
        num_list	result
        [12, 4, 15, 46, 38, 1, 14, 56, 32, 10]	[15, 32, 38, 46, 56]     */
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(sol.solution(num_list)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int lenArr = num_list.length - 5;
        if (lenArr <= 0) return new int[0];
        int[] answer = new int[lenArr];
        for (int i = 5; i < lenArr + 5; i++) {
            answer[i - 5] = num_list[i];
        }
        return answer;
    }
}