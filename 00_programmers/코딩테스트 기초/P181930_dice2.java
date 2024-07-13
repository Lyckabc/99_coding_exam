/**
 * Class: P181930_dice2
 *
 * @author lyckabc
 * @date 2024-07-13 19:26
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181930_dice2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 5;
        int b = 3;
        int c = 3;

        System.out.println(sol.solution(a,b,c));
    }
}
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;

        int count = 1;
        if(a == b || a == c || b == c) {
            count++;
        }

        if(a == b && b == c) {
            count++;
        }

        for(int i = 1; i <= count; i++) {
            answer *= (pow(a,i)+pow(b,i)+pow(c,i));
        }

        return answer;
    }
    private int pow(int a, int b) {
        if(b == 0) return 1;
        return a * pow(a, b-1);
    }

}   
