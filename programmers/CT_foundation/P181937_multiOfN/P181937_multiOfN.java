/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/16/2024  11:21 AM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P181937;
import java.util.*;
import java.io.*;

public class P181937_multiOfN {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 34;
        int n = 3;

        System.out.println(sol.solution(num, n));
    }
}
class Solution {
    public int solution(int num, int n) {
        if ((num % n == 0))
            return 1;
        return 0;
    }
}