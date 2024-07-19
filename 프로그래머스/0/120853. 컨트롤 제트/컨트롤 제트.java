class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        int lenStr = str.length;
        int postInt = 0;
        for (int i = 0; i < lenStr; i++) {
            String c = str[i];
            if (c.equals("Z")) {
                answer -= postInt;
            } else {
                answer += Integer.parseInt(c);
                postInt = Integer.parseInt(c);
            }
        }
        return answer;
    }
}