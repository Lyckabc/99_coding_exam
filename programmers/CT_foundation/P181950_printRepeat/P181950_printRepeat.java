/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        12/31/2023  4:44 AM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/

import java.util.*;
import java.io.*;

public class P181950_printRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}
