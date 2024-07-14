package P120908;

import java.util.*;
import java.io.*;

public class P120908 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "ab6CDE443fgh22iJKlmn1o";
        String s2 = "6CD";
        System.out.println(sol.solution(s1,s2));

        s1 = "ppprrrogrammers";
        s2 = "pppp";
        System.out.println(sol.solution(s1,s2));

        s1 = "AbcAbcA";
        s2 = "AAA";
        System.out.println(sol.solution(s1,s2));

    }
}

class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        if (str1.contains(str2)) {
            answer = 1;
        }
        return answer;
    }
}