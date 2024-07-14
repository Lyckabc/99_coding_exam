package B5613_calculPro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/****************************************************
 **                                                 **
 **        99_coding_exam                          **
 **        B5613                                  **
 **        Made by Toji                          **
 **        12/26/2023 :5:08 PM                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
public class B5613 {
    public static void main(String[] args) throws IOException {
        Solution sol = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> calcul = new LinkedList<>();
        String input;
        while (!(input = br.readLine()).equals("=")) {
            calcul.add(input);
        }

        System.out.println(sol.solution(calcul));
    }
}
class Solution {
    public int solution(LinkedList<String> calcul) {
        int result = Integer.parseInt(calcul.getFirst());

        for (int i = 1; i < calcul.size(); i+=2) {
            String op = calcul.get(i);
            int Num = Integer.parseInt(calcul.get(i + 1));
            switch (op) {
                case "+" :
                    result += Num;
                    break;
                case "-" :
                    result -= Num;
                    break;
                case "*" :
                    result *= Num;
                    break;
                case "/" :
                    result /= Num;
                    break;
            }
        }
        return result;
    }
}