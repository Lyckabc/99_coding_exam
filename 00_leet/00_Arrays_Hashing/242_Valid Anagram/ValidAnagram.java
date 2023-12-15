package ValidAnagram;

import java.util.*;
import java.io.*;

public class ValidAnagram {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution testchk = new Solution();

        try{
            String strchk1 = new String();
            String strchk2 = new String();

            System.out.printf("작성할 배열을 입력해주세요 :");
            strchk1 = br.readLine();
            strchk2 = br.readLine();

            if (testchk.isAnagram(strchk1, strchk2)) {
                System.out.println("true : 중복된 배열이 있습니다.");
            } else {
                System.out.println("false : 중복된 배열이 없습니다.");
            }
            System.out.println("총 입력된 배열s는 : " + Arrays.toString(strchk1.split("")));
            System.out.println("총 입력된 배열t는 : " + Arrays.toString(strchk2.split("")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        boolean chkbool = true;
        char[] charArrays = s.toCharArray();
        char[] charArrayt = t.toCharArray();

        Arrays.sort(charArrays);
        Arrays.sort(charArrayt);

        String sorteds = new String(charArrays);
        String sortedt = new String(charArrayt);
        if(!sorteds.equals(sortedt)) {
            chkbool = false ;
        }

        return chkbool;
    }
}
