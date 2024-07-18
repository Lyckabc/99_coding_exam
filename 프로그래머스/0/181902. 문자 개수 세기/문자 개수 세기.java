class Solution {
    int[] alpha = new int[52];
    public int[] solution(String my_string) {
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alpha[c - 'a' + 26]++;
            }else if (c >= 'A' && c <= 'Z') {
                alpha[c - 'A']++;
            }
        }
        return alpha;
    }
}