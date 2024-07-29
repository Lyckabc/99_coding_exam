class Solution {
    public String[] solution(String my_str, int n) {
        int lenStr = my_str.length();
        int lenA = lenStr % n == 0 ? lenStr / n : (lenStr / n) + 1 ;
        String[] answer = new String[lenA];
        for (int i = 0 , j = 0; i < lenA; i++,j+=n) {
            if (n + j> lenStr) {
                answer[i] = my_str.substring(j);
                break;
            }
            answer[i] = my_str.substring(j, n + j);
        }
        return answer;
    }
}