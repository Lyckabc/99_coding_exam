class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if (multiple(num_list) < sumSquare(num_list)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
    public int multiple(int[] num_list) {
        int sum = 1;
        for (int i = 0; i < num_list.length; i++) {
            sum *= num_list[i];
        }
        return sum;
    }
    public int sumSquare(int[] num_list) {
        int sum = 0;
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
        }
        return (int)Math.pow(sum, 2);
    }
}