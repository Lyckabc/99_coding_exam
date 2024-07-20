class Solution {
    public String[] solution(String[] names) {
        int lenGr = names.length;
        String[] answer = new String[lenGr % 5 == 0 ? lenGr / 5 : lenGr /5 + 1];
        for (int i = 0; i < lenGr; i++) {
            if (i % 5 == 0) {
                answer[i / 5] = names[i];
            }
        }
        return answer;
    }
}