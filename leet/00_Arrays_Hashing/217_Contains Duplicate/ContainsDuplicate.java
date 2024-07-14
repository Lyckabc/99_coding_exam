package ContainsDuplicate;

import java.io.*;
import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int inputnumsize;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution chkdup = new Solution();

        try{
            System.out.printf("작성할 숫자 배열 사이즈를 입력해주세요 :");
            inputnumsize = Integer.parseInt(br.readLine());
            int[] numchkdup = new int[inputnumsize];

            System.out.printf("작성할 숫자 배열을 입력해주세요 :");
            for (int i = 0; i < inputnumsize; i++) {
                numchkdup[i] = Integer.parseInt(br.readLine());
            }

            if (chkdup.containsDuplicate(numchkdup)) {
                System.out.println("true : 중복된 배열이 있습니다.");
            } else {
                System.out.println("false : 중복된 배열이 없습니다.");
            }
            System.out.println("총 입력된 배열은 : ");
            for (int num : numchkdup) {
                System.out.print(num + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> chkset = new HashSet<>();

        for (int num : nums) {
            if(!chkset.add(num)) {
                return true;
            }
            chkset.add(num);
        }
        return false;
    }
}