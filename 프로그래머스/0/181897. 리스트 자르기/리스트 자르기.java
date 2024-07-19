import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int lenNumList = num_list.length;
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int[] answer = {};
        switch (n) {
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, b + 1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, a, lenNumList);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, a, b + 1);
                break;
            case 4:
                answer = new int[(b - a) / c + 1];
                for (int i = a, j = 0; i <= b; i += c, j++) {
                    answer[j] = num_list[i];
                }
                break;
        }
        return answer;
    }
}