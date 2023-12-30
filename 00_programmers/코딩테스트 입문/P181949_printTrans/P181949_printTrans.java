/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        12/31/2023  4:47 AM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/

import java.util.*;
import java.io.*;

public class P181949_printTrans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String trans = "";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c-=32;
            } else if (c >= 'A' && c <= 'Z') {
                c+=32;
            }
            trans += c;
        }
        System.out.println(trans);
    }
}
