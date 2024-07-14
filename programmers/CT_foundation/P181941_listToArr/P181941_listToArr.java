/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/12/2024  4:56 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P181941;
import java.util.*;
import java.io.*;

public class P181941_listToArr {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] arr = {"a","b","c"};

        System.out.println(sol.solution(arr));
    }
}
class Solution {
    public String solution(String[] arr) {
        String transS = "";
        for (int i = 0; i < arr.length; i++) {
            transS += arr[i];
        }
        return transS;
    }
}