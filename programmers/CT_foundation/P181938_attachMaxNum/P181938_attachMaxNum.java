/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/15/2024  12:07 AM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P181938;
import java.util.*;
import java.io.*;

public class P181938_attachMaxNum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 2;
        int b = 91;

        System.out.println(sol.solution(a,b));

    }
}
class Solution {
    public int solution(int a, int b) {
        StringBuilder numA = new StringBuilder();
        numA.append(a);
        numA.append(b);
        int B = 2 * a * b;
        int A = Integer.parseInt(numA.toString());
        if (A >= (B)) {
            return A;
        }

        return B;
    }
}