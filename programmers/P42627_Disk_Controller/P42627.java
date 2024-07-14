/****************************************************
 **                                                 **
 **        99_coding_exam                          **
 **        P42627                                  **
 **        Made by Toji                          **
 **        12/24/2023 :7:17 AM                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
package P42627;

import java.util.Arrays;
import java.util.PriorityQueue;

public class P42627 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] A = {{0,3},{1,9},{2,6}};

        System.out.println(sol.solution(A));
    }
}
class Solution {
    public int solution(int[][] jobs) {
        int idle = 0;
        int waitTime = 0;
        int costTime = 0;
        int cnt = 0;

        PriorityQueue<Job> wait = new PriorityQueue<>((x1, x2) -> x1.start - x2.start);
        PriorityQueue<Job> ready = new PriorityQueue<>((x1, x2) -> x1.cost - x2.cost);

        for (int i = 0; i < jobs.length; i++) {
            wait.add(new Job(jobs[i][0], jobs[i][1]));
        }

        while (cnt < jobs.length) {
            while (!wait.isEmpty() && wait.peek().start <= costTime) {
                ready.add(wait.poll());
            }
            if (ready.isEmpty()) {
                idle += wait.peek().start - costTime;
                costTime = wait.peek().start;
            } else {
                Job job = ready.poll();
                waitTime += costTime - job.start;
                costTime += job.cost;
                cnt++;
            }
        }

        return (waitTime + costTime - idle) / cnt;
    }

    class Job {
        int start;
        int cost;

        public Job(int start, int cost) {
            this.start = start;
            this.cost = cost;
        }
    }
}