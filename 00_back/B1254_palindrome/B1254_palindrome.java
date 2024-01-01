/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/2/2024  7:01 AM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/

import java.util.*;
import java.io.*;

public class B1254_palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution sol = new Solution();

        String s = br.readLine();

        System.out.println(sol.solution(s));
    }
}
class Solution {
    public int solution (String S) {

        int len = S.length();

        for (int i = 0; i < len; i++) {
            if (ispanlindrome(S.substring(i))) {
                break;
            }
            len++;
        }

        return len;
    }
    public boolean ispanlindrome(String s) {
        int begin = 0;
        int fini = s.length()-1;

        while (begin <= fini) {
            if (s.charAt(begin) != s.charAt(fini)) {
                return false;
            }
            begin++;
            fini--;
        }

        return true;
    }

}