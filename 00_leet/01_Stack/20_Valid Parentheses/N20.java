package leet;

import java.io.*;
import java.util.*;

public class N20 {
    public static void main(String[] args) {
        String s = "(]";
        Solution sol = new Solution();
        if (sol.isValid(s)) {
            System.out.println("s is true");
        } else {
            System.out.println("s is false");
        }
   }
}

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>() {
            {
                put(')', '(');
                put('}', '{');
                put(']', '[');
            }
        };
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty() || stack.pop() != map.get(c)) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}