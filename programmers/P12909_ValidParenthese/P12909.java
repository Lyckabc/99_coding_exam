package P12909;
import java.util.HashMap;
import java.util.Stack;


/****************************************************
 **                                                 **
 **        99_coding_exam                          **
 **        P12909                                  **
 **        Made by Toji                          **
 **        12/25/2023 :4:56 AM                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
public class P12909 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "()()";

        System.out.println(sol.solution(s));
    }
}
class Solution {
    boolean solution(String s) {
        Stack<Character> validPa = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                validPa.push(c);
            } else if (c == ')') {
                if (validPa.isEmpty() || validPa.pop()!='(') {
                    return false;
                }
            }
        }


        return validPa.isEmpty();
    }
}