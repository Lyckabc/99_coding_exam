/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        12/31/2023  6:28 AM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P120808;
import java.util.*;
import java.io.*;

public class P120808_gcd {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 입력값
        int num1 = 1;
        int denom1 = 2;
        int num2 = 3;
        int denom2 = 4;

        // Solution 클래스의 메서드 호출
        int[] result = solution.solution(num1, denom1, num2, denom2);

        // 결과 출력
        System.out.println("결과: " + result[0] + "/" + result[1]);
    }
}

class Solution {
    public int[] solution(int num1, int denom1, int num2, int denom2) {
        int resultNum = num1 * denom2 + num2 * denom1;
        int resultDenom = denom1 * denom2;

        int gcd = 1;

        for (int i = resultDenom; i >= 1; i--) {
            if ((resultNum % i == 0)  && (resultDenom % i == 0)) {
                gcd = i;
                break;
            }
        }

        int[] answer = {(resultNum / gcd), (resultDenom / gcd)};
        return answer;
    }
}