/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        12/31/2023  5:01 AM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/

import java.util.*;
import java.io.*;

public class P181944_chkEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0) {
            System.out.println(n+ " is even");
        } else if (n%2==1) {
            System.out.println(n + " is odd");
        }
    }
}
