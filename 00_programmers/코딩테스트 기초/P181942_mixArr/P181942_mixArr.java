/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/9/2024  11:31 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P181942;

import java.util.*;
import java.io.*;

public class P181942_mixArr {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "aaaaa";
        String s2 = "bbbbb";

        System.out.println(sol.solution(s1,s2));
    }
}
class Solution {
    public String solution(String str1, String str2) {
        String s = "";
        int j = 0;
        int k = 0;
        for (int i = 1; i <= str1.length() + str2.length(); i++) {
            if (i % 2 == 1) {
                s += str1.charAt(j);
                j++;
            } else {
                s += str2.charAt(k);
                k++;
            }
        }
        return s;
    }
}