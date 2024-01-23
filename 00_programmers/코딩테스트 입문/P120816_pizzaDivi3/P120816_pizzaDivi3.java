/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/23/2024  6:51 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P120816;
import java.util.*;
import java.io.*;

public class P120816_pizzaDivi3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 12;
        int slice = 4;

        System.out.println(sol.solution(slice,n));
    }
}

class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if (n % slice == 0) {
            answer = (n / slice);
        } else {
            answer = (n / slice) + 1;
        }

        return answer;
    }
}