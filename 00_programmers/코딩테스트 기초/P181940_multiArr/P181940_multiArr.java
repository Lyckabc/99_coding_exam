/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/12/2024  5:08 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P181940;
import java.util.*;
import java.io.*;

public class P181940_multiArr {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "string";
        int k = 3;

        System.out.println(sol.solution(s,k));
    }
}
class Solution {
    public String solution(String my_string, int k) {
        String multiArr = "";
        for (int i = 0; i < k; i++) {
            multiArr += my_string;
        }
        return multiArr;
    }
}