/**
 * Class: P181926_operateNum
 *
 * @author lyckabc
 * @date 2024-07-14 16:57
 * Copyright (c) 2024 lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public class P181926_operateNum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 0;
        String control = "wsdawsdassw";

        System.out.println(sol.solution(n, control));
    }
}
class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for (char c : control.toCharArray()) {
            switch(c) {
                case 'w': answer += 1; break;
                case 's': answer -= 1; break;
                case 'd': answer += 10; break;
                case 'a': answer -= 10; break;
                default:break;
            }
        }
        return answer;
    }
}