/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        P181935_evenOrOdd                    **
 **        Made by Toji                              **
 **        1/19/2024  4:11 AM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P181935_evenOrOdd;

import java.util.*;
import java.io.*;

public class P181935_evenOrOdd {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 7 ;

        System.out.println(sol.solution(n));
    }
}
class Solution {
    public int solution(int n) {
        int sum = 0;
        if (n % 2 == 0){
            for (int i = 0; i <= n; i+=2) {
                sum += (i * i);
            }
        } else {
            for (int i = 1; i <= n; i+=2) {
                sum += i;
            }
        }
        return sum;
    }
}