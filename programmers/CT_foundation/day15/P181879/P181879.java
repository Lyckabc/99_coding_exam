package programmers.CT_foundation.day15.P181879;
/**
 * Class: P181879
 *
 * @author lyckabc
 * @date 2024-07-21 23:02
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181879 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};

        long startTime = System.nanoTime();
        System.out.println(sol.solution(num_list));
        long endTime = System.nanoTime();
        System.out.printf("method speed: %.6f ms%n", (endTime - startTime) / 1_000_000.0);

    }
}
class Solution {
    public int solution(int[] num_list) {
        int lenNumList = num_list.length;
        int answer;
        if (lenNumList >= 11) {
            answer = 0;
        } else {
            answer =1;
        }
        for (int i = 0; i < lenNumList; i++) {
            int tmpNum = num_list[i];
            if (lenNumList >= 11) {
                answer += tmpNum;
            } else {
                answer *= tmpNum;
            }
        }
        return answer;
    }
}
/*
class Solution {
    public int solution(int[] num_list) {
        int answer = (num_list.length < 11 ? 1 : 0);

        for(int i=0; i<num_list.length; i++){

            if(num_list.length < 11) {
                answer *= num_list[i];
            }else{
                answer += num_list[i];
            }

        }

        return answer;
    }
}
 */