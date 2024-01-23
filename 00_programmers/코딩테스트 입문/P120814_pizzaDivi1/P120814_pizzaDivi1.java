/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/23/2024  6:51 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P120814;
import java.util.*;
import java.io.*;

public class P120814_pizzaDivi1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 15;

        System.out.println(sol.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 7 == 0) {
            answer = (n / 7);
        } else {
            answer = (n / 7) + 1;
        }

        return answer;
    }
}