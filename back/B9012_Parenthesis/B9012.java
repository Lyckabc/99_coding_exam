package B9012;

import java.io.*;
import java.util.*;

public class B9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution sol = new Solution();

        int N = Integer.parseInt(br.readLine());
        ArrayList<String> GrS = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            GrS.add(br.readLine().trim());
        }
        for (int i = 0; i < N ; i++) {
            String s = GrS.get(i);
            if (sol.Parenthesis(s))
                System.out.println("YES");
            else if (!(sol.Parenthesis(s)))
                System.out.println("NO");
        }
    }
}

class Solution {
    public boolean Parenthesis(String s) {
        int CntP = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(') {
                CntP++;
            } else if (s.charAt(i)==')') {
                if (CntP <= 0) return false;
                CntP--;
            }
        }

        return CntP==0;
    }
}