/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/9/2024  11:19 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P120813;

import java.util.*;
import java.io.*;

public class P120813_hateEvenNum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;

        System.out.println(sol.solution(n));
    }
}
class Solution {
    public int[] solution(int n) {
        List<Integer> onlyOdd = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                onlyOdd.add(i);
            }
        }
        return onlyOdd.stream().mapToInt(i -> i).toArray();
    }
}