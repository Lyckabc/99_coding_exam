package leet;

import java.io.*;


public class TwoSum{
    public static void main(String[] args) {
        int inputtestsize;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution chktest = new Solution();
        int target;
        int[] output;

        try{
            System.out.printf("작성할 숫자 배열 사이즈를 입력해주세요 :");
            inputtestsize = Integer.parseInt(br.readLine());
            int[] numchktest = new int[inputtestsize];

            System.out.printf("작성할 숫자 배열을 입력해주세요 :");
            for (int i = 0; i < inputtestsize; i++) {
                numchktest[i] = Integer.parseInt(br.readLine());
            }

            System.out.printf("twoSum 목표 값을 입력해주세요 :");
            target = Integer.parseInt(br.readLine());

            output = chktest.twoSum(numchktest, target);

            System.out.println("총 입력된 배열은 : ");
            for (int num : output) {
                System.out.print(num + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }
}
