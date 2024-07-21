package programmers.CT_foundation.day15.P181880;
/**
 * Class: P181880
 *
 * @author lyckabc
 * @date 2024-07-21 22:56
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181880 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {12, 4, 15, 1, 14};
        long startTime = System.nanoTime();
        System.out.println(sol.solution(num_list));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
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
/*
import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        return Arrays.stream(num_list)
        .map(i -> Integer.toBinaryString(i)
        .length() - 1)
        .sum();
    }
}
 */
/*
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0;num_list.length>i;i++){
            while(num_list[i]!=1){
                num_list[i]/=2;
                answer++;
            }
        }
        return answer;
    }
}
 */
