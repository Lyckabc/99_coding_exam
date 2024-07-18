package programmers.CT_basic.day10.P120842;
/**
 * Class: P120842
 *
 * @author lyckabc
 * @date 2024-07-18 00:58
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
import java.util.Arrays;
public class P120842 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;

        long startTime = System.nanoTime();
        System.out.println(Arrays.deepToString(sol.solution(num_list, n)));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int lenNumList = num_list.length;
        int row = lenNumList / n ;
        int[][] answer = new int[row][n];
        for (int i = 0; i < lenNumList; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        return answer;
    }
}
/*
import java.util.Arrays;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        int chk = 0;
        for(int i =0; i <= num_list.length-1; i+=n){
            int[] a = Arrays.copyOfRange(num_list, i, i+n);
            answer[chk] = a;
            chk++;
        }
        return answer;
    }
}

 */