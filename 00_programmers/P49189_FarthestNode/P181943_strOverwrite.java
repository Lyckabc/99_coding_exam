/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        12/31/2023  5:04 AM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/
package P181943;
import java.util.*;
import java.io.*;

public class P181943_strOverwrite {
    public static void main(String[] args) {
        P181943_strOverwrite obj = new P181943_strOverwrite();
        String str1 = "He11oWor1d";
        String str2 = "lloWorl";
        int s = 2;
        System.out.println(solution(str1,str2,s));
    }
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int lenMy = my_string.length();
        int lenOver = overwrite_string.length();

        for (int i = 0; i < lenMy; i++) {
            if (i==s) {
                for (int j = 0; j < lenOver; j++) {
                    char c = overwrite_string.charAt(j);
                    answer+=c;
                    if (j != lenOver-1) {
                        i++;
                    }
                }
            } else {
               char c = my_string.charAt(i);
               answer+=c;
            }
        }
        return answer;
    }
}
