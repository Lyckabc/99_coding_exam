package ValidPalindrome;

import java.io.*;
import java.util.*;

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "0P";
        boolean check = solution.isPalindrome(s);
        if (check) {
            System.out.println(s + ": is a palindrome");
        } else {
            System.out.println(s + ": is not a palindrome");
        }
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        String beta = takeoffalpha(s);
        String ateb = new StringBuilder(beta).reverse().toString();
        return beta.equals(ateb);
    }
    public static String takeoffalpha(String s) {
        StringBuilder trans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' & c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0'&& c <= '9')) {
                c = Character.toLowerCase(c);
                trans.append(c);
            }
        }
        return trans.toString();
    }
}