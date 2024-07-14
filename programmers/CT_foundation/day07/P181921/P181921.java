package day07.P181921;
/**
 * Class: P181921
 *
 * @author lyckabc
 * @date 2024-07-15 01:39
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181921 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int l = 5;
        int r = 555;

        long startTime = System.nanoTime();
        for (int num : sol.solution(l,r)) {
            System.out.print(num + " ");
        }
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int[] solution(int l, int r) {
        int lenList = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = l; i <= r; i++) {

            if (chkNum(i)) {
                lenList++;
                sb.append(i);
                sb.append(" ");
            }
        }
        if (lenList == 0) return new int[] {-1};
        int[] answer = new int[lenList];
        String[] strList = sb.toString().split(" ");
        for (int i = 0; i < lenList; i++) {
            answer[i] = Integer.parseInt(strList[i]);
        }
        return answer;
    }
    public boolean chkNum(int num) {
        String strNum = String.valueOf(num);
        for (char c : strNum.toCharArray()) {
            if ((c >= '1' && c <= '4') || (c >= '6' && c <= '9')) return false;
        }
        return true;
    }
}
/* 2진법 풀이 best. but slower than my code
 class Solution {
    public int[] solution(int l, int r) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }
}
 */


/* optimize but slower than my code
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (chkNum(i)) {
                resultList.add(i);
            }
        }
        if (resultList.isEmpty()) {
            return new int[] {-1};
        }
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        return answer;
    }

    public boolean chkNum(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
 */