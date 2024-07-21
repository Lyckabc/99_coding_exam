package programmers.CT_foundation.day15.P181881;
/**
 * Class: P181881
 *
 * @author lyckabc
 * @date 2024-07-21 22:22
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181881 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 100, 99, 98};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(arr));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    private int lenArr;
    public int solution(int[] arr) {
        int answer = 0;
        lenArr = arr.length;
        int[] curArr = arr.clone();
        int[] prevArr = arr.clone();
        while (true) {
            curArr = arrCalcul(curArr);
            answer++;
            if (isSame(curArr, prevArr)) {
                break;
            }
            prevArr = curArr.clone();
        }
        
        return answer - 1;
    }
    public int[] arrCalcul(int[] arr) {
        for (int i = 0; i < lenArr; i++) {
            int tmp = arr[i];
            if (tmp >= 50 && tmp % 2 == 0) {
                arr[i] = tmp / 2;
            } else if (tmp < 50 && tmp % 2 != 0) {
                arr[i] = tmp * 2 + 1;
            }
            
        }
        return arr;
    }
    public boolean isSame(int[] arr1, int[] arr2) {
        for (int i = 0; i < lenArr; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
/*
import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        return Arrays.stream(arr).map(i -> cntAction(i)).max().getAsInt();
    }

    private int cntAction(int n) {

        int cnt = 0;
        boolean flag = true;

        while (flag) {

            if (n % 2 == 0 && 50 <= n) {
                n /= 2;
                cnt++;
            } else if (n % 2 == 1 && n < 50) {
                n *= 2;
                n += 1;
                cnt++;
            } else {
                flag = false;
            }
        }
        return cnt;
    }
}
 */
/*
import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        while (true) {
            int[] copied = Arrays.copyOf(arr, arr.length);
            for (int i = 0 ; i < copied.length ; i++) {
                if (copied[i] >= 50 && copied[i] % 2 == 0) {
                    copied[i] /= 2;
                } else if (copied[i] < 50 && copied[i] % 2 == 1) {
                    copied[i] = copied[i] * 2 + 1;
                }
            }
            if (Arrays.equals(arr, copied)) {
                return count;
            }
            arr = copied;
            count++;
        }
    }
}
 */