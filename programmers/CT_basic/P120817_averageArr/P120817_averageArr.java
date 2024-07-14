/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/21/2024  10:09 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P120817;
import java.util.*;
import java.io.*;

public class P120817_averageArr {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(sol.solution(A));
    }
}
class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            sum += numbers[i];
        }

        return ((sum) / (double) len)  ;
    }
}