class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && b != c && c != a) {
            answer = a + b + c;
        } else if ((a == b && c != a) || (b == c && a != b) || (c == a && b != c)) {
            answer = (a + b + c) * (pow(a,2)+ pow(b,2)+ pow(c,2));
        } else if (a == b && b == c){
            answer = (a + b + c) * (pow(a,2)+ pow(b,2)+ pow(c,2)) * (pow(a,3)+ pow(b,3)+ pow(c,3));
        }
        return answer;
    }
    public int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

}   