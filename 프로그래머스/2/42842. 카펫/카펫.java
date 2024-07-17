class Solution {
    public int[] solution(int brown, int yellow) {
        // brown + yellow = total
        // yellowWidth <= (width - 2);
        // yellowHeight <= (height - 2);
        // width >= height;
        // width * height = total;
        int[] answer = {};
        int total = brown + yellow;
        for (int i = 3; i < total / 2; i++) {
            if (total % i == 0) {
                int width = total / i;
                if (yellow == (width - 2) * (i - 2)) {
                    answer = new int[] {width, i};
                    break;
                }
            }
        }
        return answer;
    }
}