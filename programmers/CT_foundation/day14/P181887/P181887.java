package programmers.CT_foundation.day14.P181887;
/**
 * Class: P181887
 *
 * @author lyckabc
 * @date 2024-07-20 22:47
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181887 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {4, 2, 6, 1, 7, 6};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(num_list));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num_list.length; i++) {
            int curNum = num_list[i];
            if (i % 2 == 0) {
                odd += curNum;
            } else {
                even += curNum;
            }
        }
        return Math.max(odd,even);
    }
}
/*
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        int temp = 0;
        int temp1 = 0;
        for(int i=0; i<num_list.length; i++){
            if(i%2==0){
                temp+=num_list[i];
            }else{
                temp1+=num_list[i];
            }
        }
        answer = temp>temp1?temp:temp1;
        return answer;
    }
}
 */