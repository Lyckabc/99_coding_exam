/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/23/2024  6:51 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P120815;
import java.util.*;
import java.io.*;

public class P120815_pizzaDivi2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4;

        System.out.println(sol.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 1;
        int slice = 6;

        while (!( n * answer % slice == 0)) {
            answer++;
        }

        return (n * answer) / 6;
    }
}