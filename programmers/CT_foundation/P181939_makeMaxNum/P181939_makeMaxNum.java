/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/12/2024  5:16 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P181939;
import java.util.*;
import java.io.*;

public class P181939_makeMaxNum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 89;
        int b = 7;

        System.out.println(sol.solution(a,b));

    }
}
class Solution {
    public int solution(int a, int b) {
        StringBuilder numA = new StringBuilder();
        StringBuilder numB = new StringBuilder();
        numA.append(a);
        numA.append(b);
        numB.append(b);
        numB.append(a);
        int A = Integer.parseInt(numA.toString());
        int B = Integer.parseInt(numB.toString());
        if (A >= B) {
            return A;
        }

        return B;
    }
}