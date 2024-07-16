class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        for (int i = 0; i < queries.length; i++) {
            StringBuilder temp = new StringBuilder(answer.substring(queries[i][0], queries[i][1] + 1));
            answer.replace(queries[i][0], queries[i][1] + 1, temp.reverse().toString());
        }
        return answer.toString();
    }
}