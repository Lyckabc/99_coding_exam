import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.*;

/****************************************************
 **                                                 **
 **        99_coding_exam                          **
 **        P42587                                  **
 **        Made by Toji                          **
 **        12/24/2023 :5:51 AM                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
public class P42587 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] priorities1 = {2,1,3,2};
        int location1 = 2;

        int[] priorities2 = {1,1,9,1,1,1};
        int location2 = 0;

        System.out.println(sol.solution(priorities1,location1));
        System.out.println(sol.solution(priorities2,location2));

    }
}
class Solution {
    public int solution(int[] priorities, int location) {
        int count = 0;
        Queue<Integer> que = new LinkedList<>();
        PriorityQueue<Integer> prique = new PriorityQueue<>(Collections.reverseOrder());

        for (Integer num : priorities) {
            prique.add(num);
        }
        while (prique.size() > 0) {
            for (int i = 0; i < priorities.length ; i++) {
                if (prique.peek() == priorities[i]) {
                    prique.poll();
                    count++;
                    if (i == location) {
                        return count;
                    }
                }
            }
        }
        return count;
    }
}