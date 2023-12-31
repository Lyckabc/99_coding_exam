/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/1/2024  8:51 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P120812;
import java.util.*;
import java.io.*;

public class P120812_modeValue {
    public static void main(String[] args) {
        int[] A = {1,2,3,3,3,4};
        System.out.println(solution(A));
    }
    public static int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int cntNum = -1;
        for (int value : map.values()) {
            if (value > cntNum) {
                 cntNum = value;
            }
        }
        int cnt = 0;
        int mode =0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(cntNum)) {
                cnt++;
                mode = entry.getKey();
                if (cnt > 1) {
                    return -1;
                }
            }
        }

        return mode;
    }
}
