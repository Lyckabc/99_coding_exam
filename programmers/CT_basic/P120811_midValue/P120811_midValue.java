/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        1/1/2024  8:41 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P120811;
import java.util.*;
import java.io.*;

public class P120811_midValue {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length/2];
        return answer;
    }
}
