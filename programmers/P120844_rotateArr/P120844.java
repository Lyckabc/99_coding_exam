/****************************************************
 **                                                 **
 **        99_coding_exam                          **
 **        P120844                                  **
 **        Made by Toji                          **
 **        12/26/2023 :4:12 PM                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package P120844;
import java.util.*;
public class P120844 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {1, 2, 3};
        String s = "right";

        for (int num : sol.solution(A,s)) {
            System.out.print(num + " ");
        }
        System.out.println();
        A =new int[]{4, 455, 6, 4, -1, 45, 6};
        s = "left";
        for (int num : sol.solution(A,s)) {
            System.out.print(num + " ");
        }

    }
}
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] roArr = new int[numbers.length];
        int start = 0;
        int j = 0;
        int len = numbers.length;

        if ("right".equals(direction)) {
            roArr[0] = numbers[numbers.length-1];
            start = 1;
        } else if ("left".equals(direction)) {
            roArr[numbers.length-1] = numbers[0];
            j = 1;
            len--;
        }
        for (int i = start; i < len; i++) {
            roArr[i] = numbers[j];
            j++;
        }

        return roArr;
    }
}