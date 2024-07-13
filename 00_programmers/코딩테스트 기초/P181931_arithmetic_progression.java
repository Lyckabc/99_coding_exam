/******************************************************
 **                                                  **
 **        99_coding_exam                                 **
 **        PACKAGE_NAME                    **
 **        Made by Toji                              **
 **        7/13/2024  17:58 PM                       **
 **        https://github.com/lyckabc                **
 **                                                  **
 ******************************************************/

 import java.util.*;
 import java.io.*;
 
 public class P181931_arithmetic_progression {
     public static void main(String[] args) {
         Solution sol = new Solution();
         int a = 3;
         int d = 4;
         boolean[] included = {true, false, false, true, true};
 
         System.out.println(sol.solution(a, d, included));
     }
 }
 
 class Solution {
     public int solution(int a, int d, boolean[] included) {
         int answer = 0;
         int starterNum = a;
         for (int i = 0; i < included.length; i++) {
             if (included[i]) {
                 answer += starterNum;
             }
             starterNum += d;
         }
         return answer;
     }
 }