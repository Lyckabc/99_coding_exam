/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/27/2024  6:34 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/

import java.util.*;
import java.io.*;

public class P181933_convertByFlag {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {1, 2, 3, 4};
        String s = "Hello, world";

        System.out.println(sol.solution(A));
        System.out.println(sol.solution(s));
    }
}
class Solution {
    public int solution(int a, int b, boolean flag) {
        int sum = 0;
        if (flag) {
            sum = a + b;
        } else {
            sum = a - b;
        }
        return sum;
    }
}