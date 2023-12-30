/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        12/31/2023  6:57 AM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P120809;
import java.util.*;
import java.io.*;

public class P120809_doubleArr {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(sol.solution(A));
    }
}

class Solution {
    public int[] solution(int[] numbers) {
        int i = 0;
        for (int num : numbers) {
            numbers[i]*=2;
            i++;
        }

        return numbers;
    }
}
