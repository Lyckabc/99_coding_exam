class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean A = false;
        boolean B = false;

        if (x1 || x2) {
            A = true;
        } 
        if (x3 || x4) {
            B = true;
        } 
        if (A && B) {
            answer = true;
        }
        return answer;
    }
}