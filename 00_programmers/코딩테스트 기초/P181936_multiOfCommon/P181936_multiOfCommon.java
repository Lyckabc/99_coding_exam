/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/17/2024  11:34 AM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P181936;
import java.util.*;
import java.io.*;

public class P181936_multiOfCommon {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 60;
        int n = 2;
        int m = 3;

        System.out.println(sol.solution(num,n,m));
    }
}
class Solution {
    public int solution(int number, int n, int m) {
        if ((number % n == 0) && (number % m == 0)) {
            return 1;
        }
        return 0;
    }
}